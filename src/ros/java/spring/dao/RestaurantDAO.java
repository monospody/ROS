package ros.java.spring.dao;

import ros.java.spring.entity.EntityCategory;
import ros.java.spring.entity.EntityProduct;
import ros.java.spring.entity.EntityRestaurant;
import ros.java.spring.entity.EntityTable;

import java.util.List;

/**
 * @author Martin Dolinsky
 */
public interface RestaurantDAO {
	public List<EntityRestaurant> getRestaurants();

	List<EntityRestaurant> getRestaurantsSearch(String word, String city);

	void saveRestaurant(EntityRestaurant restaurant);

	void addRestaurant(EntityRestaurant restaurant);

	EntityRestaurant getRestaurant(int id);

	void deleteRestaurant(int id);

	List<String> getCities();

	List<EntityTable> getRestaurantTables(int id);

	List<EntityProduct> getProductsByRestaurantAndAvailability(int id);

	List<EntityCategory> getCategoriesByProductsByRestaurantAndAvailability(List<EntityProduct> products, int id);
}
