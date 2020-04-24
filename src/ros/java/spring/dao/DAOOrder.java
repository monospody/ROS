package ros.java.spring.dao;

import ros.java.spring.entity.EntityOrder;
import java.util.List;

/**
 * @author Martin Dolinsky
 */
public interface DAOOrder {

	List<EntityOrder> getOrders();

	void addOrder(EntityOrder order);

	EntityOrder getOrder(int id);

	void deleteOrder(int id);
}
