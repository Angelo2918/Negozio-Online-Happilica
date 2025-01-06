package com.Angelin.controller;

import com.Angelin.models.OrderItem;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class RequestOrderDto {
    private Long userId;
    private List<OrderItem> items;
}
