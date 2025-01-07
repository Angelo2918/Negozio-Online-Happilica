package com.Angelin.services.impl;

import com.Angelin.DataTransferObject.CreateReviewDto;
import com.Angelin.models.Review;
import com.Angelin.services.ReviewService;
import org.springframework.stereotype.Service;

/**
 * This class implements the ReviewService interface to manage reviews of food items.
 */
@Service
public class ReviewServiceImpl implements ReviewService {

    @Override
    public Review addReview(CreateReviewDto dto) {
        return null;
    }
}
