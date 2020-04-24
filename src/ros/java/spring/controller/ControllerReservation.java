package ros.java.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ros.java.spring.entity.EntityOrder;
import ros.java.spring.service.ServiceOrder;

import java.sql.Timestamp;

/**
 * @author Martin Dolinsky
 */
@Controller("/reservation")
public class ControllerReservation {

	@Autowired
	private ServiceOrder serviceOrder;

	@RequestMapping("/showReservation")
	public String showReservationForm(@ModelAttribute("order") EntityOrder entityOrder) {
		return "reservation";
	}

	@PostMapping("/processAddReservationForm")
	public String addOrder(@ModelAttribute("order") EntityOrder entityOrder) {
		String time = entityOrder.getOrderDateDate() + " " + (entityOrder.getOrderFromHour()) + ":" + entityOrder.getOrderFromMinute() + ":00";
		System.out.println(time);

		entityOrder.setOrderDate(Timestamp.valueOf(time));
		System.out.println(entityOrder.getOrderDate());
		entityOrder.setOrderCustomerId(1);
		entityOrder.setOrderDPH(20);
		entityOrder.setOrderPrice(100);
		entityOrder.setOrderPriceWithDPH(120);
		entityOrder.setOrderRestaurantId(1);
		entityOrder.setOrderTableId(1);

		serviceOrder.addOrder(entityOrder);

		return "reservation";

	}
}
