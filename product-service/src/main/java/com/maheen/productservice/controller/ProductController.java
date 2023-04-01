package com.maheen.productservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.maheen.productservice.entity.Product;
import com.maheen.productservice.service.ProductService;

@RestController
public class ProductController {
    @Autowired
    private ProductService productService;

    @RequestMapping(value = "/products", method = RequestMethod.POST)
    public Product saveProduct(@RequestBody Product productId) {
        return productService.saveProduct(productId);
    }

    @RequestMapping(value = "products/{id}/", method = RequestMethod.GET)
    public Product findProductById(@PathVariable("id") String productId) {
        return productService.findProductById(productId);
    }
}