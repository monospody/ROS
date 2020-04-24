package ros.java.spring.entity;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * @author Martin Dolinsky
 */

@Entity
@Table(name = "`order`", schema = "restaurantOrderingSystem")
public class EntityOrder {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private int orderId;

	@Column(name = "customerId", nullable = false)
	private int orderCustomerId;

	@Column(name = "tableId", nullable = false)
	private int orderTableId;

	@Column(name = "restaurantId", nullable = false)
	private int orderRestaurantId;

	@Column(name = "orderDate", nullable = false)
	private Timestamp orderDate;

	@Column(name = "price", nullable = false)
	private double orderPrice;

	@Column(name = "priceWithDPH", nullable = false)
	private double orderPriceWithDPH;

	@Column(name = "DPH", nullable = false)
	private double orderDPH;

	@Transient
	private int orderFromHour;

	@Transient
	private int orderFromMinute;

	@Transient
	private int orderToHour;

	@Transient
	private int orderToMinute;

	@Transient
	private Date orderDateDate;

	public EntityOrder() {
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public int getOrderCustomerId() {
		return orderCustomerId;
	}

	public void setOrderCustomerId(int orderCustomerId) {
		this.orderCustomerId = orderCustomerId;
	}

	public int getOrderTableId() {
		return orderTableId;
	}

	public void setOrderTableId(int orderTableId) {
		this.orderTableId = orderTableId;
	}

	public int getOrderRestaurantId() {
		return orderRestaurantId;
	}

	public void setOrderRestaurantId(int orderRestaurantId) {
		this.orderRestaurantId = orderRestaurantId;
	}

	public Timestamp getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Timestamp orderDate) {
		this.orderDate = orderDate;
	}

	public double getOrderPrice() {
		return orderPrice;
	}

	public void setOrderPrice(double orderPrice) {
		this.orderPrice = orderPrice;
	}

	public double getOrderPriceWithDPH() {
		return orderPriceWithDPH;
	}

	public void setOrderPriceWithDPH(double orderPriceWithDPH) {
		this.orderPriceWithDPH = orderPriceWithDPH;
	}

	public double getOrderDPH() {
		return orderDPH;
	}

	public void setOrderDPH(double orderDPH) {
		this.orderDPH = orderDPH;
	}

	public int getOrderFromHour() {
		return orderFromHour;
	}

	public void setOrderFromHour(int orderFromHour) {
		this.orderFromHour = orderFromHour;
	}

	public int getOrderFromMinute() {
		return orderFromMinute;
	}

	public void setOrderFromMinute(int orderFromMinute) {
		this.orderFromMinute = orderFromMinute;
	}

	public int getOrderToHour() {
		return orderToHour;
	}

	public void setOrderToHour(int orderToHour) {
		this.orderToHour = orderToHour;
	}

	public int getOrderToMinute() {
		return orderToMinute;
	}

	public void setOrderToMinute(int orderToMinute) {
		this.orderToMinute = orderToMinute;
	}

	public Date getOrderDateDate() {
		return orderDateDate;
	}

	public void setOrderDateDate(Date orderDateDate) {
		this.orderDateDate = orderDateDate;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof EntityOrder)) return false;
		EntityOrder that = (EntityOrder) o;
		return orderId == that.orderId &&
				orderCustomerId == that.orderCustomerId &&
				orderTableId == that.orderTableId &&
				orderRestaurantId == that.orderRestaurantId &&
				Double.compare(that.orderPrice, orderPrice) == 0 &&
				Double.compare(that.orderPriceWithDPH, orderPriceWithDPH) == 0 &&
				Double.compare(that.orderDPH, orderDPH) == 0 &&
				orderDate.equals(that.orderDate);
	}

	@Override
	public int hashCode() {
		return Objects.hash(getOrderId(), getOrderCustomerId(), getOrderTableId(), getOrderRestaurantId(), getOrderDate(), getOrderPrice(), getOrderPriceWithDPH(), getOrderDPH());
	}

	@Override
	public String toString() {
		return "EntityOrder{" +
				"orderId=" + orderId +
				", orderCustomerId=" + orderCustomerId +
				", orderTableId=" + orderTableId +
				", orderRestaurantId=" + orderRestaurantId +
				", orderDate='" + orderDate + '\'' +
				", orderPrice=" + orderPrice +
				", orderPriceWithDPH=" + orderPriceWithDPH +
				", orderDPH=" + orderDPH +
				'}';
	}
}
