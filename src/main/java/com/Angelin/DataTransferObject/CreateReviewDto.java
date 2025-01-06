package com.Angelin.DataTransferObject;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class CreateReviewDto {
    private Long userId;
    private Long foodsId;
    private Integer rating;
    private String comment;
}
