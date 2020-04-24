package ros.java.spring.entity;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;
import java.util.Objects;

/**
 * @author Martin Dolinsky
 */
@Entity
@Table(name = "restaurant", schema = "restaurantOrderingSystem")
public class EntityRestaurant {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
    private int restaurantId;

	@Column(name = "ownerId", nullable = false)
	private int restaurantOwnerId;

	@Column(name = "name", nullable = false, length = 50)
	@NotNull(message = "is required")
	@Size(min = 1,message = "is required")
    private String restaurantName;

	@Column(name = "tables", nullable = false)
	@NotNull(message = "is required")
	@Min(value = 1)
	private int restaurantTables;

	@Column(name = "tags")
	private String restaurantTags;

	@Column(name = "openingHours")
	private String restaurantOpeningHours;

	@Column(name = "capacity")
	@NotNull(message = "is required")
	@Min(value = 1)
	private int restaurantCapacity;

	@Column(name = "address", nullable = false, length = 100)
	@NotNull(message = "is required")
	@Size(min = 1, message = "is required")
	private String restaurantAddress;

	@Column(name = "city", nullable = false, length = 50)
	@NotNull(message = "is required")
	@Size(min = 1, message = "is required")
	private String restaurantCity;

	@Column(name = "phoneNumber", nullable = false, length = 45)
	@NotNull(message = "is required")
	@Size(min = 1,message = "is required")
	private String restaurantPhoneNumber;

	@Column(name = "aboutRestaurant")
	private String restaurantAboutRestaurant;

	@Column(name = "minPriceOrder")
	private int minPriceOrder;

	@Column(name = "visitors")
	private int visitors;

	@Column(name = "priceRange")
	private int priceRange;

	@Column(name = "logo")
	private String logo;

	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "restaurantId")
	private List<EntityReview> review;

	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "restaurantId")
	private List<EntityTable> table;

	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "restaurantId")
	private List<EntityProduct> products;

	@Transient
	private double averageRating;

	@Transient
	private int percentageRating;

	public EntityRestaurant() {
	}

	public int getRestaurantId() {
        return restaurantId;
    }
    public void setRestaurantId(int id) {
        this.restaurantId = id;
    }
	public int getRestaurantOwnerId() {
		return restaurantOwnerId;
	}
	public void setRestaurantOwnerId(int restaurantOwnerId) {
		this.restaurantOwnerId = restaurantOwnerId;
	}
	public void setRestaurantCapacity(int restaurantCapacity) {
		this.restaurantCapacity = restaurantCapacity;
	}
	public String getRestaurantName() {
        return restaurantName;
    }
    public void setRestaurantName(String name) {
        this.restaurantName = name;
    }
	public int getRestaurantTables() {
		return restaurantTables;
	}
	public void setRestaurantTables(int tables) {
		this.restaurantTables = tables;
	}
	public String getRestaurantTags() {
		return restaurantTags;
	}
	public void setRestaurantTags(String tags) {
		this.restaurantTags = tags;
	}
	public String getRestaurantOpeningHours() {
		return restaurantOpeningHours;
	}
	public void setRestaurantOpeningHours(String openingHours) {
		this.restaurantOpeningHours = openingHours;
	}
	public int getRestaurantCapacity() {
		return restaurantCapacity;
	}
	public void setRestaurantCapacity(Integer capacity) {
		this.restaurantCapacity = capacity;
	}
	public String getRestaurantAddress() {
		return restaurantAddress;
	}
	public void setRestaurantAddress(String address) {
		this.restaurantAddress = address;
	}
	public String getRestaurantCity() {
		return restaurantCity;
	}
	public void setRestaurantCity(String restaurantCity) {
		this.restaurantCity = restaurantCity;
	}
	public String getRestaurantPhoneNumber() {
		return restaurantPhoneNumber;
	}
	public void setRestaurantPhoneNumber(String phoneNumber) {
		this.restaurantPhoneNumber = phoneNumber;
	}
	public String getRestaurantAboutRestaurant() {
		return restaurantAboutRestaurant;
	}
	public void setRestaurantAboutRestaurant(String aboutRestaurant) {
		this.restaurantAboutRestaurant = aboutRestaurant;
	}
	public int getMinPriceOrder() {
		return minPriceOrder;
	}
	public void setMinPriceOrder(int minPrice) {
		this.minPriceOrder = minPrice;
	}
	public int getVisitors() {
		return visitors;
	}
	public void setVisitors(int visitors) {
		this.visitors = visitors;
	}
	public int getPriceRange() {
		return priceRange;
	}
	public void setPriceRange(int priceRange) {
		this.priceRange = priceRange;
	}
	public String getLogo() {
		return logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}
	public List<EntityReview> getReview() {
		return review;
	}
	public void setReview(List<EntityReview> reviews) {
		this.review = reviews;
	}
	public double getAverageRating() {
		return averageRating;
	}
	public void setAverageRating(double averageRating) {
		this.averageRating = averageRating;
	}
	public int getPercentageRating() {
		return percentageRating;
	}
	public void setPercentageRating(int percentageRating) {
		this.percentageRating = percentageRating;
	}
	public List<EntityTable> getTable() {
		return table;
	}
	public void setTable(List<EntityTable> tables) {
		this.table = tables;
	}
	public List<EntityProduct> getProducts() {
		return products;
	}
	public void setProducts(List<EntityProduct> products) {
		this.products = products;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		EntityRestaurant that = (EntityRestaurant) o;
		return restaurantId == that.restaurantId &&
				restaurantTables == that.restaurantTables &&
				Objects.equals(restaurantName, that.restaurantName) &&
				Objects.equals(restaurantTags, that.restaurantTags) &&
				Objects.equals(restaurantOpeningHours, that.restaurantOpeningHours) &&
				Objects.equals(restaurantCapacity, that.restaurantCapacity) &&
				Objects.equals(restaurantAddress, that.restaurantAddress) &&
				Objects.equals(restaurantPhoneNumber, that.restaurantPhoneNumber) &&
				Objects.equals(restaurantAboutRestaurant, that.restaurantAboutRestaurant) &&
				Objects.equals(minPriceOrder, that.minPriceOrder) &&
				Objects.equals(visitors, that.visitors) &&
				Objects.equals(priceRange, that.priceRange) &&
				Objects.equals(logo, that.logo);
	}
	@Override
	public int hashCode() {
		return Objects.hash(restaurantId, restaurantName, restaurantTables, restaurantTags, restaurantOpeningHours, restaurantCapacity, restaurantAddress, restaurantPhoneNumber, restaurantAboutRestaurant, minPriceOrder, visitors, priceRange, logo);
	}
	@Override
	public String toString() {
		return "EntityRestaurant{" +
				"restaurantId=" + restaurantId +
				", restaurantOwnerId=" + restaurantOwnerId +
				", restaurantName='" + restaurantName + '\'' +
				", restaurantTables=" + restaurantTables +
				", restaurantTags='" + restaurantTags + '\'' +
				", restaurantOpeningHours='" + restaurantOpeningHours + '\'' +
				", restaurantCapacity=" + restaurantCapacity +
				", restaurantAddress='" + restaurantAddress + '\'' +
				", restaurantCity='" + restaurantCity + '\'' +
				", restaurantPhoneNumber='" + restaurantPhoneNumber + '\'' +
				", restaurantAboutRestaurant='" + restaurantAboutRestaurant + '\'' +
				", minPrice=" + minPriceOrder +
				", visitors=" + visitors +
				", priceRange=" + priceRange +
				", logo='" + logo + '\'' +
				'}';
	}
}
