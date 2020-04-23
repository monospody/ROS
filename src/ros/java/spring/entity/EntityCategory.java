package ros.java.spring.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "category", schema = "restaurantOrderingSystem")
public class EntityCategory {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int categoryId;

    @Column(name = "name")
    private String categoryName;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.MERGE)
    @JoinColumn(name = "categoryId")
    private List<EntityProduct> products;

    public int getCategoryId() {
        return categoryId;
    }
    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }
    public String getCategoryName() {
        return categoryName;
    }
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
    public List<EntityProduct> getProducts() {
        return products;
    }
    public void setProducts(List<EntityProduct> products) {
        this.products = products;
    }
}
