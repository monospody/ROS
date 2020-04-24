package ros.java.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ros.java.spring.dao.DAOOrderDetails;
import ros.java.spring.entity.EntityOrderDetails;

import java.util.List;

/**
 * @author Martin Dolinsky
 */
@Service
public class ServiceOrderDetailsImpl implements ServiceOrderDetails{

	@Autowired
	private DAOOrderDetails daoOrderDetails;

	@Override
	@Transactional
	public List<EntityOrderDetails> getOrderDetails() {
		return daoOrderDetails.getOrderDetails();
	}

	@Override
	@Transactional
	public void addOrderDetail(EntityOrderDetails orderDetail) {
		daoOrderDetails.addOrderDetail(orderDetail);

	}

	@Override
	@Transactional
	public EntityOrderDetails getOrderDetail(int id) {
		return daoOrderDetails.getOrderDetail(id);
	}

	@Override
	@Transactional
	public void deleteOrderDetail(int id) {
		daoOrderDetails.deleteOrderDetail(id);

	}
}
