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
		for (EntityRestaurant restaurant:restaurants) {
			Query<Integer> query1 = session.createQuery("SELECT reviewsRatingStars FROM EntityReviews WHERE reviewsRestaurantId = :restaurantID", Integer.class).setParameter("restaurantID", restaurant.getRestaurantId());
			List<Integer> res = query1.getResultList();
			double avg = 0;
			for (Integer re : res) {
				avg += re;
			}
			avg = avg/res.size();
			restaurant.setAverageRating(avg);
		}
		return restaurants;
	}

	@Override
	public List<EntityRestaurant> getRestaurantsSearch(String word, String city) {
		Session currentSession = sessionFactory.getCurrentSession();
		if (word == null) {
			word = "";
		}

		if (word.trim().length() > 0) {
			Query<EntityRestaurant> theQuery;
			theQuery = currentSession.createQuery("from EntityRestaurant where (restaurantCity like :city AND restaurantName like :word) or (restaurantCity like :city AND restaurantTags like :word)", EntityRestaurant.class);
			theQuery.setParameter("word", "%" + word + "%");
			theQuery.setParameter("city", "%" + city + "%");
			System.out.println(theQuery.list());
			return theQuery.getResultList();
		}
		else {
			Query<EntityRestaurant> theQuery2;
			theQuery2 = currentSession.createQuery("from EntityRestaurant where restaurantCity like :city ", EntityRestaurant.class);
			theQuery2.setParameter("city", "%" + city + "%");
			System.out.println(theQuery2.list());
			return theQuery2.getResultList();
		}


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
