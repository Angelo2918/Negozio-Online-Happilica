package com.Angelin.controller;

import com.Angelin.DataTransferObject.CreateReviewDto;
import com.Angelin.models.Review;
import com.Angelin.services.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/reviews")
public class ReviewController {
    @Autowired
    private ReviewService reviewService;

    @PostMapping
    public ResponseEntity<Review> addReview(@RequestBody CreateReviewDto dto) {
        return ResponseEntity.ok(reviewService.addReview(dto));
    }
}
