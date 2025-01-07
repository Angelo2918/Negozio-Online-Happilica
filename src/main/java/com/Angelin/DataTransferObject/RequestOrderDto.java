package com.Angelin.DataTransferObject;

import com.Angelin.models.OrderItem;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Represents a data transfer object for handling request order information.
 * It contains details about the user placing the order and a list of order items.
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class RequestOrderDto {
private Long userId;
private List<OrderItem> items;

    public List<OrderItem> getItems() {
        return items;
    }

    public void setItems(List<OrderItem> items) {
        this.items = items;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
