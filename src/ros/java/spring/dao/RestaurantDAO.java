package ros.java.spring.dao;

import ros.java.spring.entity.EntityRestaurant;

import java.util.List;

/**
 * @author Martin Dolinsky
 */
public interface RestaurantDAO {
	public List<EntityRestaurant> getRestaurants();

	public List<EntityRestaurant> getRestaurantsByKeyword(String word);

	List<EntityRestaurant> getRestaurantsByCity(String word);

	void saveRestaurant(EntityRestaurant restaurant);

	void addRestaurant(EntityRestaurant restaurant);

	EntityRestaurant getRestaurant(int id);

	void deleteRestaurant(int id);
}
