package com.Angelin.services;

import com.Angelin.DataTransferObject.CreateReviewDto;
import com.Angelin.models.Review;

public interface ReviewService {
    Review addReview(CreateReviewDto dto);
}
