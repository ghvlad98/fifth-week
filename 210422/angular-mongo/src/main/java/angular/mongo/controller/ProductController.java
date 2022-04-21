package angular.mongo.controller;


import angular.mongo.domain.Product;
import angular.mongo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v3")
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping(path = "/product")
    ResponseEntity<List<Product>> getAll() {
        return new ResponseEntity<>(productService.findAll(), HttpStatus.OK);
    }

    @GetMapping(path = "/{id}")
    ResponseEntity<Product> getProductById(@PathVariable String id) {
        return new ResponseEntity<Product>(productService.findById(id).get(), HttpStatus.OK);
    }

    @PostMapping(path = "/product")
    ResponseEntity<Product> create(@RequestBody Product product) {
        return new ResponseEntity<>(productService.create(product), HttpStatus.OK);
    }
}
