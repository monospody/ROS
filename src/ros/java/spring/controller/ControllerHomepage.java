package ros.java.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import ros.java.spring.entity.EntityCustomer;
import ros.java.spring.entity.EntityRestaurant;
import ros.java.spring.service.RestaurantService;

import java.util.List;

@Controller
public class ControllerHomepage {

    @Autowired
    private RestaurantService restaurantService;

    @RequestMapping("/home")
    public String showHome(Model model){

        EntityCustomer customer = new EntityCustomer();
        model.addAttribute("customer", customer);

        List<EntityRestaurant> restaurants = restaurantService.getRestaurants();
        model.addAttribute("restaurants", restaurants);

        List<String> cities = restaurantService.getCities();
        model.addAttribute("cities", cities);

        return "homepage";
    }
}
