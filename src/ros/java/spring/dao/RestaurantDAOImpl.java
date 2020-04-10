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
		List<EntityRestaurant> restaurants = query.getResultList();

		setTransientVariables(restaurants);

		return restaurants;
	}

	@Override
	public void setTransientVariables(List<EntityRestaurant> restaurants){
		Session session = sessionFactory.getCurrentSession();
		for (EntityRestaurant restaurant:restaurants) {
			Query<Integer> query1 = session.createQuery("SELECT reviewsRatingStars FROM EntityReview WHERE reviewsRestaurantId = :restaurantID", Integer.class).setParameter("restaurantID", restaurant.getRestaurantId());
			List<Integer> res = query1.getResultList();
			double avg = 0;
			for (Integer re : res) {
				avg += re;
			}
			avg = avg/res.size();
			restaurant.setPercentageRating((int) ((avg/3)*100));
			restaurant.setAverageRating(avg);
		}
	}

	@Override
	public List<String> getCities() {
		Session session = sessionFactory.getCurrentSession();
		Query<String> query = session.createQuery("SELECT restaurantCity FROM EntityRestaurant", String.class);
		return query.getResultList();
	}

	@Override
	public List<EntityRestaurant> getRestaurantsByKeyword(String word) {
		Session currentSession = sessionFactory.getCurrentSession();
		Query theQuery;
		if (word != null && word.trim().length() > 0) {
			theQuery =currentSession.createQuery("from EntityRestaurant where lower(restaurantName) like :word or lower(restaurantTags) like :word", EntityRestaurant.class);
			theQuery.setParameter("word", "%" + word.toLowerCase() + "%");

		}
		else {
			theQuery = currentSession.createQuery("from EntityRestaurant ", EntityRestaurant.class);
		}

		return theQuery.getResultList();
	}

	@Override
	public List<EntityRestaurant> getRestaurantsByCity(String city) {
		Session currentSession = sessionFactory.getCurrentSession();

		Query theQuery;
		theQuery = currentSession.createQuery("from EntityRestaurant where restaurantCity like :city", EntityRestaurant.class);
		theQuery.setParameter("city", "%" + city.toLowerCase() + "%");

		return theQuery.getResultList();
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
