package com.Angelin.DataTransferObject;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Data transfer object for creating a new review.
 */
@NoArgsConstructor
@Data
public class CreateReviewDto {
    private Long userId;
    private Long foodId;
    private Integer rating;
    private String comment;

    public Long getUserId() {
        return userId;
    }

    public Long getFoodId() {
        return foodId;
    }

    public Integer getRating() {
        return rating;
    }

    public String getComment() {
        return comment;
    }
}
