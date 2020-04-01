package ros.java.spring.service;

import ros.java.spring.entity.EntityRestaurant;

import java.util.List;

/**
 * @author Martin Dolinsky
 */
public interface RestaurantService {

	public List<EntityRestaurant> getRestaurants();

	void saveRestaurant(EntityRestaurant restaurant);

}
