package com.tau.redis.controller;

import com.tau.redis.entity.Product;
import com.tau.redis.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping({"/", "/products"})
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/")
    public String home() {
        return "Welcome to the product API!";
    }

    @PostMapping("/save")
    public Product saveProduct(@RequestBody Product product) {
        return productRepository.save(product);
    }

    @GetMapping("/getAll")
    public List<Product> getAllProducts() {
        try {
            return (List<Product>) productRepository.findAll();
        } catch (Exception e) {
            e.printStackTrace();
            // Log the exception and handle it appropriately
            throw e; // rethrowing for simplicity, handle it as needed
        }
    }


    @GetMapping("/getById/{productId}")
    public Optional<Product> getProductById(@PathVariable int productId) {
        return productRepository.findById(productId);
    }

    @DeleteMapping("/remove/{productId}")
    public void removeProduct(@PathVariable int productId) {
        productRepository.deleteById(productId);
    }
}
