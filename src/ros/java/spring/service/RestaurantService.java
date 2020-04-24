package ros.java.spring.service;

import ros.java.spring.entity.EntityCategory;
import ros.java.spring.entity.EntityProduct;
import ros.java.spring.entity.EntityRestaurant;
import ros.java.spring.entity.EntityTable;

import java.util.List;

/**
 * @author Martin Dolinsky
 */
public interface RestaurantService {

	public List<EntityRestaurant> getRestaurants();

	public List<EntityRestaurant> getRestaurantsByKeyword(String word);

	void saveRestaurant(EntityRestaurant restaurant);

	EntityRestaurant getRestaurant(int id);

	void deleteRestaurant(int id);

	void addRestaurant(EntityRestaurant restaurant);

	List<EntityRestaurant> getRestaurantsByCity(String city);

    List<String> getCities();

    List<EntityTable> getRestaurantTables(int id);

    List<EntityProduct> getProductsByRestaurantAndAvailability(int id);

	List<EntityCategory> getCategoriesByProductsByRestaurantAndAvailability(List<EntityProduct> products, int id);
}
