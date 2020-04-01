package ros.java.spring.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ros.java.spring.entity.EntityRestaurant;


import java.util.List;

/**
 * @author Martin Dolinsky
 */
@Repository
public class RestaurantDAOImpl implements RestaurantDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<EntityRestaurant> getRestaurants() {
		Session session = sessionFactory.getCurrentSession();
		Query<EntityRestaurant> query = session.createQuery("from EntityRestaurant", EntityRestaurant.class);
		return query.getResultList();
	}

	@Override
	public void saveRestaurant(EntityRestaurant restaurant) {
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(restaurant);
	}

	@Override
	public void addRestaurant(EntityRestaurant restaurant) {
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(restaurant);
	}

	@Override
	public EntityRestaurant getRestaurant(int id) {
		Session session = sessionFactory.getCurrentSession();
		return session.get(EntityRestaurant.class, id);
	}

	@Override
	public void deleteRestaurant(int id) {
		Session session = sessionFactory.getCurrentSession();

		Query query = session.createQuery("delete from EntityRestaurant where restaurantId=:restaurantId");
		query.setParameter("restaurantId", id);
		query.executeUpdate();


	}
}
