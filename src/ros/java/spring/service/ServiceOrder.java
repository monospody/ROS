package ros.java.spring.service;

import ros.java.spring.entity.EntityOrder;

import java.util.List;

/**
 * @author Martin Dolinsky
 */
public interface ServiceOrder {
	List<EntityOrder> getOrders();

	void addOrder(EntityOrder order);

	EntityOrder getOrder(int id);

	void deleteOrder(int id);
}
