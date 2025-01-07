package com.Angelin.enums;

/**
 * Enum representing the possible status of an order.
 * It can be one of the following:
 * PENDING - Order has been created but not processed yet.
 * PROCESSING - Order is currently being processed.
 * SHIPPED - Order has been shipped but not yet delivered.
 * DELIVERED - Order has been successfully delivered.
 * CANCELLED - Order has been cancelled and will not be processed.
 */
public enum OrderStatus {
    PENDING, PROCESSING, SHIPPED, DELIVERED, CANCELLED
}
