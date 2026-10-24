package com.dev.ecom_inventory_service.listner;

import com.dev.ecom_inventory_service.model.OrderCreatedEvent;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class OrderCreatedListener {

    @RabbitListener(queues = "inventory.queue")
    public void handleOrderCreatedEvent(OrderCreatedEvent orderCreatedEvent) {
        System.out.println("Received Order Created event :" + orderCreatedEvent);
    }
}
