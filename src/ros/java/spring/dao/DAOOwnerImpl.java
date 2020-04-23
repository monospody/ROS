package ros.java.spring.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ros.java.spring.entity.EntityOwner;

@Repository
public class DAOOwnerImpl implements DAOOwner {
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<EntityOwner> getOwners() {
		Session session=sessionFactory.getCurrentSession();
		Query<EntityOwner> query=session.createQuery("from EntityOwner", EntityOwner.class);
		return query.getResultList();
	}
	
	@Override
	public void saveOwner(EntityOwner owner) {
		Session session=sessionFactory.getCurrentSession();
		session.saveOrUpdate(owner);

	}

	@Override
	public EntityOwner getOwner(int id) {
		Session session=sessionFactory.getCurrentSession();
		return session.get(EntityOwner.class, id);

	}

	@Override
	public void deleteOwner(int id) {
		Session session=sessionFactory.getCurrentSession();
		
		Query query=session.createQuery("delete from EntityOwner where ownerId=:ownerId");
		query.setParameter("restaurantId", id);
		query.executeUpdate();

	}

	@Override
	public void addOwner(EntityOwner owner) {
		Session session=sessionFactory.getCurrentSession();
		session.saveOrUpdate(owner);
		
	}

}
