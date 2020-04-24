package ros.java.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ros.java.spring.entity.EntityRestaurant;
import ros.java.spring.dao.RestaurantDAO;

import java.beans.Transient;
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
	public List<EntityRestaurant> getRestaurantsSearch(String word, String city) {
		return restaurantDAO.getRestaurantsSearch(word, city);
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
