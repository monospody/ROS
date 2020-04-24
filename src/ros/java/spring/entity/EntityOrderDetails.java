package ros.java.spring.entity;

import javax.persistence.*;
import java.util.Objects;

/**
 * @author Martin Dolinsky
 */
@Entity
@Table(name = "orderDetails", schema = "restaurantOrderingSystem")
public class EntityOrderDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private int orderDetailsId;

	@Column(name = "productId", nullable = false)
	private int orderDetailsProductId;

	@Column(name = "orderId", nullable = false)
	private int orderTableId;

	@Column(name = "quantity", nullable = false)
	private double orderRestaurantId;

	public EntityOrderDetails() {
	}

	public int getOrderDetailsId() {
		return orderDetailsId;
	}

	public void setOrderDetailsId(int orderDetailsId) {
		this.orderDetailsId = orderDetailsId;
	}

	public int getOrderDetailsProductId() {
		return orderDetailsProductId;
	}

	public void setOrderDetailsProductId(int orderDetailsProductId) {
		this.orderDetailsProductId = orderDetailsProductId;
	}

	public int getOrderTableId() {
		return orderTableId;
	}

	public void setOrderTableId(int orderTableId) {
		this.orderTableId = orderTableId;
	}

	public double getOrderRestaurantId() {
		return orderRestaurantId;
	}

	public void setOrderRestaurantId(double orderRestaurantId) {
		this.orderRestaurantId = orderRestaurantId;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof EntityOrderDetails)) return false;
		EntityOrderDetails that = (EntityOrderDetails) o;
		return orderDetailsId == that.orderDetailsId &&
				orderDetailsProductId == that.orderDetailsProductId &&
				orderTableId == that.orderTableId &&
				Double.compare(that.orderRestaurantId, orderRestaurantId) == 0;
	}

	@Override
	public int hashCode() {
		return Objects.hash(orderDetailsId, orderDetailsProductId, orderTableId, orderRestaurantId);
	}

	@Override
	public String toString() {
		return "EntityOrderDetails{" +
				"orderDetailsId=" + orderDetailsId +
				", orderDetailsProductId=" + orderDetailsProductId +
				", orderTableId=" + orderTableId +
				", orderRestaurantId=" + orderRestaurantId +
				'}';
	}
}

