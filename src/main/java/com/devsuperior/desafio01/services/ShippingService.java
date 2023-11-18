package com.devsuperior.desafio01.services;

import com.devsuperior.desafio01.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {
    public double shipment(Order order) {
        double basic = order.getBasic();
        if (basic >= 200) {
            return 0;
        } else if (basic >= 100) {
            return 12;
        } else {
            return 20;
        }
    }
}
