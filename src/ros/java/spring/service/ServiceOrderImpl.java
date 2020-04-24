package ros.java.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ros.java.spring.dao.DAOOrder;
import ros.java.spring.entity.EntityOrder;

import java.util.List;

/**
 * @author Martin Dolinsky
 */
@Service
public class ServiceOrderImpl implements ServiceOrder {

	@Autowired
	private DAOOrder daoOrder;

	@Override
	@Transactional
	public List<EntityOrder> getOrders() {
		return daoOrder.getOrders();
	}

	@Override
	@Transactional
	public void addOrder(EntityOrder order) {
		daoOrder.addOrder(order);
	}

	@Override
	@Transactional
	public EntityOrder getOrder(int id) {
		return daoOrder.getOrder(id);
	}

	@Override
	@Transactional
	public void deleteOrder(int id) {
		daoOrder.deleteOrder(id);

	}
}
