package ros.java.spring.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ros.java.spring.entity.EntityOrder;
import java.sql.Timestamp;
import java.util.List;

/**
 * @author Martin Dolinsky
 */
@Repository
public class DAOOrderImpl implements DAOOrder {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<EntityOrder> getOrders() {
		Session session = sessionFactory.getCurrentSession();
		Query<EntityOrder> query = session.createQuery("from EntityOrder", EntityOrder.class);
		return query.getResultList();
	}

	@Override
	public void addOrder(EntityOrder order) {
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(order);
	}

	@Override
	public EntityOrder getOrder(int id) {
		Session session = sessionFactory.getCurrentSession();
		return session.get(EntityOrder.class, id);
	}

	@Override
	public void deleteOrder(int id) {
		Session session = sessionFactory.getCurrentSession();

		Query query = session.createQuery("DELETE FROM EntityOrder WHERE orderId=:orderId");
		query.setParameter("orderId", id);
		query.executeUpdate();
	}
}
