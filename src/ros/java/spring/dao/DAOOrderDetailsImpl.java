package ros.java.spring.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ros.java.spring.entity.EntityOrderDetails;
import java.util.List;

/**
 * @author Martin Dolinsky
 */
@Repository
public class DAOOrderDetailsImpl implements DAOOrderDetails {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<EntityOrderDetails> getOrderDetails() {
		Session session = sessionFactory.getCurrentSession();
		Query<EntityOrderDetails> query = session.createQuery("from EntityOrderDetails", EntityOrderDetails.class);
		return query.getResultList();
	}

	@Override
	public void addOrderDetail(EntityOrderDetails order) {
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(order);
	}

	@Override
	public EntityOrderDetails getOrderDetail(int id) {
		Session session = sessionFactory.getCurrentSession();
		return session.get(EntityOrderDetails.class, id);
	}

	@Override
	public void deleteOrderDetail(int id) {
		Session session = sessionFactory.getCurrentSession();

		Query query = session.createQuery("DELETE FROM EntityOrderDetails WHERE orderDetailsId=:orderDetailsId");
		query.setParameter("orderDetailsId", id);
		query.executeUpdate();
	}
}
