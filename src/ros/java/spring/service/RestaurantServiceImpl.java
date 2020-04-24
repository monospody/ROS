package ros.java.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ros.java.spring.entity.EntityCategory;
import ros.java.spring.entity.EntityProduct;
import ros.java.spring.entity.EntityRestaurant;
import ros.java.spring.dao.RestaurantDAO;
import ros.java.spring.entity.EntityTable;

import java.util.List;

/**
 * @author Martin Dolinsky
 */
@Service
public class RestaurantServiceImpl implements RestaurantService {

	@Autowired
	private RestaurantDAO restaurantDAO;

	@Override
	@Transactional
	public List<EntityRestaurant> getRestaurants() {
		return restaurantDAO.getRestaurants();
	}

	@Override
	@Transactional
	public List<EntityRestaurant> getRestaurantsByKeyword(String word) {
		return restaurantDAO.getRestaurantsByKeyword(word);
	}

	@Override
	@Transactional
	public List<EntityRestaurant> getRestaurantsByCity(String city) {
		return restaurantDAO.getRestaurantsByCity(city);
	}

	@Override
	@Transactional
	public List<String> getCities() {
		return restaurantDAO.getCities();
	}

	@Override
	@Transactional
	public List<EntityTable> getRestaurantTables(int id) {
		return restaurantDAO.getRestaurantTables(id);
	}

	@Override
	@Transactional
	public List<EntityProduct> getProductsByRestaurantAndAvailability(int id) {
		return restaurantDAO.getProductsByRestaurantAndAvailability(id);
	}

	@Override
	@Transactional
	public List<EntityCategory> getCategoriesByProductsByRestaurantAndAvailability(List<EntityProduct> products, int id) {
		return restaurantDAO.getCategoriesByProductsByRestaurantAndAvailability(products, id);
	}

	@Override
	@Transactional
	public void saveRestaurant(EntityRestaurant restaurant) {
		restaurantDAO.saveRestaurant(restaurant);
	}

	@Override
	@Transactional
	public EntityRestaurant getRestaurant(int id) {
		return restaurantDAO.getRestaurant(id);
	}

	@Override
	@Transactional
	public void deleteRestaurant(int id) {
		restaurantDAO.deleteRestaurant(id);
	}

	@Override
	@Transactional
	public void addRestaurant(EntityRestaurant restaurant) {
		restaurantDAO.addRestaurant(restaurant);
	}
}
