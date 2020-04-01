package ros.java.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ros.java.spring.entity.EntityRestaurant;
import ros.java.spring.dao.RestaurantDAO;

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
	public void saveRestaurant(EntityRestaurant restaurant) {
		restaurantDAO.saveRestaurant(restaurant);

	}
}
