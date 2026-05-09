package com.example.demo.service;
import com.example.demo.model.CartItem;
import com.example.demo.model.Order;
import com.example.demo.model.Product;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class EcommerceService {
	
	private List<Product> products = new ArrayList<>();
    private List<CartItem> cart = new ArrayList<>();
    private List<Order> orders = new ArrayList<>();

    private Long productIdCounter = 1L;
    private Long orderIdCounter = 1L;

    // Add Product
    public Product addProduct(Product product) {
        product.setId(productIdCounter++);
        products.add(product);
        return product;
    }

    // Get All Products
    public List<Product> getAllProducts() {
        return products;
    }

    // Add To Cart
    public String addToCart(CartItem item) {
        cart.add(item);
        return "Added to cart";
    }

    // View Cart
    public List<CartItem> viewCart() {
        return cart;
    }

    // Place Order
    public Order placeOrder() {
        double total = 0;

        for (CartItem item : cart) {
            for (Product product : products) {
                if (product.getId().equals(item.getProductId())) {
                    total += product.getPrice() * item.getQuantity();
                }
            }
        }

        Order order = new Order(orderIdCounter++, new ArrayList<>(cart), total);
        orders.add(order);
        cart.clear();

        return order;
    }

    // View Orders
    public List<Order> getOrders() {
        return orders;
}
}