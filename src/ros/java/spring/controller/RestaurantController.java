package ros.java.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import ros.java.spring.entity.EntityRestaurant;
import ros.java.spring.service.RestaurantService;
import javax.validation.Valid;
import java.util.List;

/**
 * @author Martin Dolinsky
 */
@Controller
@RequestMapping("/restaurant")
public class RestaurantController {

	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
	}

	@Autowired
	private RestaurantService restaurantService;


	@GetMapping("/list")
	public String showRestaurants(Model model) {
		List<EntityRestaurant> restaurantList = restaurantService.getRestaurants();
		model.addAttribute("restaurants", restaurantList);
		return "restaurants-list";
	}

	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model model) {
		EntityRestaurant newRestaurant = new EntityRestaurant();
		model.addAttribute("restaurant", newRestaurant);
		return "restaurant-form";
	}

	@RequestMapping("/showFindRestaurantForm")
	public String showFindRestaurantForm(Model model) {

		return "homepage";
	}

	@PostMapping("/processAddRestaurantForm")
	public String addRestaurant(@ModelAttribute("restaurant") EntityRestaurant restaurant){
		restaurant.setRestaurantOwnerId(1);
		restaurant.setRestaurantTags("{\"tags\": [{\"title\": \"Burger\"}, {\"title\": \"Pizza\"}, {\"title\": \"Pasta\"}]}");
		restaurant.setRestaurantOpeningHours("{\"openingHours\": [{\"day\": \"Pondelok\", \"hours\": \"8:00 - 20:00\"}, {\"day\": \"Utorok\", \"hours\": \"8:00 - 20:00\"}, {\"day\": \"Streda\", \"hours\": \"8:00 - 20:00\"}, {\"day\": \"Štvrtok\", \"hours\": \"8:00 - 20:00\"}, {\"day\": \"Piatok\", \"hours\": \"8:00 - 00:00\"}, {\"day\": \"Sobota\", \"hours\": \"12:00 - 00:00\"}, {\"day\": \"Nedeľa\", \"hours\": \"8:00 - 20:00\"}]}");
		restaurant.setRestaurantPhoneNumber("09101213");
		restaurant.setRestaurantAboutRestaurant("about");
		restaurantService.saveRestaurant(restaurant);
		return "redirect:/restaurant/list";
	}

	@GetMapping("/search")
	public String findRestaurantByKeyword(@RequestParam("word") String word, Model model) {
		List<EntityRestaurant> restaurants = restaurantService.getRestaurantsByKeyword(word);
		model.addAttribute("restaurants", restaurants);
		return "restaurants-list";
	}

	@GetMapping("/searchByCity")
	public String findRestaurantByCity(@RequestParam("city") String city, Model model) {
		if (!city.equals("")) {
		List<EntityRestaurant> restaurants = restaurantService.getRestaurantsByCity(city);
		model.addAttribute("restaurants", restaurants);
			return "restaurants-list";
		}
		return "homepage";

	}

	@PostMapping("/saveRestaurant")
	public String saveRestaurant(@Valid @ModelAttribute("restaurant") EntityRestaurant restaurant, BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			return "restaurant-form";
		}
		else {
			restaurant.setRestaurantOwnerId(1);
			restaurant.setRestaurantTags("{\"tags\": [{\"title\": \"Burger\"}, {\"title\": \"Pizza\"}, {\"title\": \"Pasta\"}]}");
			restaurant.setRestaurantOpeningHours("{\"openingHours\": [{\"day\": \"Pondelok\", \"hours\": \"8:00 - 20:00\"}, {\"day\": \"Utorok\", \"hours\": \"8:00 - 20:00\"}, {\"day\": \"Streda\", \"hours\": \"8:00 - 20:00\"}, {\"day\": \"Štvrtok\", \"hours\": \"8:00 - 20:00\"}, {\"day\": \"Piatok\", \"hours\": \"8:00 - 00:00\"}, {\"day\": \"Sobota\", \"hours\": \"12:00 - 00:00\"}, {\"day\": \"Nedeľa\", \"hours\": \"8:00 - 20:00\"}]}");
			restaurant.setRestaurantPhoneNumber("09101213");
			restaurant.setRestaurantAboutRestaurant("about");
			restaurantService.saveRestaurant(restaurant);
			return "redirect:/restaurant/list";
		}

	}

	@RequestMapping("/showUpdateRestaurantForm")
	public String showUpdateRestaurantForm(@RequestParam("restaurantId") int id, Model model) {
		EntityRestaurant restaurant = restaurantService.getRestaurant(id);
		model.addAttribute("restaurant", restaurant);
		return "restaurant-form";
	}

	@RequestMapping("/deleteRestaurant")
	public String deleteRestaurant(@RequestParam("restaurantId") int id) {
		restaurantService.deleteRestaurant(id);
		return "redirect:/restaurant/list";
	}



}
