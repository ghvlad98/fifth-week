package angular.mongo.service;

import angular.mongo.domain.Order;

import java.util.List;
import java.util.Optional;

public interface OrderService {
    List<Order> findAll();
    Order create(Order order);
    Optional<Order> findById(String id);
}
