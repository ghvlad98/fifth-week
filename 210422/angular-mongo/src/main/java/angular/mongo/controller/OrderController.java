package angular.mongo.controller;

import angular.mongo.domain.Order;
import angular.mongo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v4")
public class OrderController {

    @Autowired
    OrderService orderService;

    @GetMapping(path = "/order")
    ResponseEntity<List<Order>> getAll() {
        return new ResponseEntity<>(orderService.findAll(), HttpStatus.OK);
    }

    @GetMapping(path = "/{id}")
    ResponseEntity<Order> getProductById(@PathVariable String id) {
        return new ResponseEntity<Order>(orderService.findById(id).get(), HttpStatus.OK);
    }

    @PostMapping(path = "/order")
    ResponseEntity<Order> create(@RequestBody Order order) {
        return new ResponseEntity<>(orderService.create(order), HttpStatus.OK);
    }
}
