package com.Angelin.services;

import com.Angelin.DataTransferObject.CreateReviewDto;
import com.Angelin.models.Review;

/**
 * ReviewService interface represents a service to manage reviews of food items.
 */
public interface ReviewService {
    Review addReview(CreateReviewDto dto);
}
