package ros.java.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ros.java.spring.entity.EntityOrderDetails;

import java.util.List;

/**
 * @author Martin Dolinsky
 */
public interface ServiceOrderDetails {

	List<EntityOrderDetails> getOrderDetails();

	void addOrderDetail(EntityOrderDetails orderDetail);

	EntityOrderDetails getOrderDetail(int id);

	void deleteOrderDetail(int id);

}
