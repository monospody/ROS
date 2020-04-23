package ros.java.spring.entity;

import javax.persistence.*;

@Entity
@Table(name = "product", schema = "restaurantOrderingSystem")
public class EntityProduct {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int productId;

    @Column(name = "name")
    private String productName;

    @Column(name = "quantity")
    private int productQuantity;

    @Column(name = "infoRecipe")
    private String productInfoRecipe;

    @Column(name = "timeDifficulty")
    private int productTimeDifficulty;

    @Column(name = "availability")
    private int productAvailability;

    @Column(name = "restaurantId")
    private int productRestaurantId;

    @Column(name = "categoryId")
    private int productCategoryId;

    public int getProductId() {
        return productId;
    }
    public void setProductId(int productId) {
        this.productId = productId;
    }
    public String getProductName() {
        return productName;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }
    public int getProductQuantity() {
        return productQuantity;
    }
    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }
    public String getProductInfoRecipe() {
        return productInfoRecipe;
    }
    public void setProductInfoRecipe(String productInfoRecipe) {
        this.productInfoRecipe = productInfoRecipe;
    }
    public int getProductTimeDifficulty() {
        return productTimeDifficulty;
    }
    public void setProductTimeDifficulty(int productTimeDifficulty) {
        this.productTimeDifficulty = productTimeDifficulty;
    }
    public int getProductAvailability() {
        return productAvailability;
    }
    public void setProductAvailability(int productAvailability) {
        this.productAvailability = productAvailability;
    }
    public int getProductRestaurantId() {
        return productRestaurantId;
    }
    public void setProductRestaurantId(int productRestaurantId) {
        this.productRestaurantId = productRestaurantId;
    }
    public int getProductCategoryId() {
        return productCategoryId;
    }
    public void setProductCategoryId(int productCategoryId) {
        this.productCategoryId = productCategoryId;
    }
}
