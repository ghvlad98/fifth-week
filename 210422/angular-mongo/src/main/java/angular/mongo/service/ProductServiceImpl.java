package angular.mongo.service;

import angular.mongo.domain.Product;
import angular.mongo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductRepository productRepository;

    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public Product create(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Optional<Product> findById(String id) {
        return productRepository.findById(id);
    }
}
