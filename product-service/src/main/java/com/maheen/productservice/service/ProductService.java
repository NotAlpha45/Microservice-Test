package com.maheen.productservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maheen.productservice.entity.Product;
import com.maheen.productservice.repository.ProductRepository;

@Service

public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    public Product findProductById(String productId) {
        return productRepository.findProductById(productId);
    }
}
