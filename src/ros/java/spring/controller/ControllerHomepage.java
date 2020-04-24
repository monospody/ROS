package ros.java.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ros.java.spring.entity.EntityCustomer;
import ros.java.spring.entity.EntityOrder;
import ros.java.spring.entity.EntityRestaurant;
import ros.java.spring.service.RestaurantService;
import ros.java.spring.service.ServiceOrder;

import java.sql.Time;
import java.sql.Timestamp;
import java.util.List;

@Controller
public class ControllerHomepage {

    @Autowired
    private RestaurantService restaurantService;

    @RequestMapping("/home")
    public String showHome(Model model) {

        EntityCustomer customer = new EntityCustomer();
        model.addAttribute("customer", customer);

        List<EntityRestaurant> restaurants = restaurantService.getRestaurants();
        model.addAttribute("restaurants", restaurants);

        return "homepage";
    }

	@RequestMapping("/registerRestaurant")
	public String registerRestaurant(@ModelAttribute("restaurant") EntityRestaurant entityRestaurant) {

    	return "registerstep1";
	}
}
