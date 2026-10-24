package com.dev.ecom_inventory_service.model;

public record OrderCreatedEvent(
        Long orderid,
        Long customerId,
        Long productId,
        int quantity
) {
}
