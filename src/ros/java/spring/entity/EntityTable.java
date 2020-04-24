package ros.java.spring.entity;

import javax.persistence.*;

@Entity
@Table(name = "table", schema = "restaurantOrderingSystem")
public class EntityTable {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int tableId;

    @Column(name = "chairs")
    private int tableChairs;

    @Column(name = "restaurantId")
    private int tableRestaurantId;

    public int getTableId() {
        return tableId;
    }
    public void setTableId(int tableId) {
        this.tableId = tableId;
    }
    public int getTableChairs() {
        return tableChairs;
    }
    public void setTableChairs(int tableChairs) {
        this.tableChairs = tableChairs;
    }
    public int getTableRestaurantId() {
        return tableRestaurantId;
    }
    public void setTableRestaurantId(int tableRestaurantId) {
        this.tableRestaurantId = tableRestaurantId;
    }
}
