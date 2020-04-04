package ros.java.spring.entity;

import javax.persistence.*;

@Entity
@Table(name = "reviews", schema = "restaurantOrderingSystem")
public class EntityReviews {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int reviewsId;

    @Column(name = "ratingStars")
    private int reviewsRatingStars;

    @Column(name = "comment")
    private String reviewsComment;

    @Column(name = "customerId")
    private int reviewsCustomerId;

    @Column(name = "restaurantId")
    private int reviewsRestaurantId;

    public int getReviewsId() {
        return reviewsId;
    }
    public void setReviewsId(int reviewsId) {
        this.reviewsId = reviewsId;
    }
    public int getReviewsRatingStars() {
        return reviewsRatingStars;
    }
    public void setReviewsRatingStars(int reviewsRatingStars) {
        this.reviewsRatingStars = reviewsRatingStars;
    }
    public String getReviewsComment() {
        return reviewsComment;
    }
    public void setReviewsComment(String reviewsComment) {
        this.reviewsComment = reviewsComment;
    }
    public int getReviewsCustomerId() {
        return reviewsCustomerId;
    }
    public void setReviewsCustomerId(int reviewsCustomerId) {
        this.reviewsCustomerId = reviewsCustomerId;
    }
    public int getReviewsRestaurantId() {
        return reviewsRestaurantId;
    }
    public void setReviewsRestaurantId(int reviewsRestaurantId) {
        this.reviewsRestaurantId = reviewsRestaurantId;
    }

    @Override
    public String toString() {
        return "EntityReviews{" +
                "reviewsId=" + reviewsId +
                ", reviewsRatingStars=" + reviewsRatingStars +
                ", reviewsComment='" + reviewsComment + '\'' +
                ", reviewsCustomerId=" + reviewsCustomerId +
                ", reviewsRestaurantId=" + reviewsRestaurantId +
                '}';
    }
}
