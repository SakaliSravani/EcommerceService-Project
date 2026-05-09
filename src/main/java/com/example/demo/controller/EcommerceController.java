package com.example.demo.controller;

import com.example.demo.model.CartItem;
import com.example.demo.model.Order;
import com.example.demo.model.Product;
import com.example.demo.service.EcommerceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")

public class EcommerceController {
	
	@Autowired
    private EcommerceService service;

    // Product APIs
    @PostMapping("/products")
    public Product addProduct(@RequestBody Product product) {
        return service.addProduct(product);
    }

    @GetMapping("/products")
    public List<Product> getProducts() {
        return service.getAllProducts();
    }

    // Cart APIs
    @PostMapping("/cart")
    public String addToCart(@RequestBody CartItem item) {
        return service.addToCart(item);
    }

    @GetMapping("/cart")
    public List<CartItem> viewCart() {
        return service.viewCart();
    }

    // Order APIs
    @PostMapping("/orders")
    public Order placeOrder() {
        return service.placeOrder();
    }

    @GetMapping("/orders")
    public List<Order> getOrders() {
        return service.getOrders();


    
    }
}