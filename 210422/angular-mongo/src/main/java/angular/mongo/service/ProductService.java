package angular.mongo.service;

import angular.mongo.domain.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    List<Product> findAll();
    Product create(Product product);
    Optional<Product> findById(String id);
}
