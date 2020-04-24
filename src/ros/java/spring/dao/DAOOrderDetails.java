package ros.java.spring.dao;

import ros.java.spring.entity.EntityOrderDetails;

import java.util.List;

/**
 * @author Martin Dolinsky
 */
public interface DAOOrderDetails {

	List<EntityOrderDetails> getOrderDetails();

	void addOrderDetail(EntityOrderDetails order);

	EntityOrderDetails getOrderDetail(int id);

	void deleteOrderDetail(int id);
}
