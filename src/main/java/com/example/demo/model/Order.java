package com.example.demo.model;

import java.util.List;

public class Order { 

	private Long orderId;
	private List<CartItem> items;
	private double totalAmount;
	
	public Order() {}
	
	public Order(Long orderId, List<CartItem> items, double totalAmount) {
		this.orderId = orderId;
		this.items = items;
		this.totalAmount = totalAmount;
	}
	public Long getOrderId() 
	{
		return orderId;
	}
	public void setOrderId(Long orderId) 
	{
		this.orderId = orderId;
	}
	public List<CartItem> getItems() 
	{
		return items;
	}
	public void setItems(List<CartItem> items)
	{
		this.items = items;
	}
	public double getTotalAmount()
	{
		return totalAmount;
	}
	public void setTotalAmount(double totalAmount)
	{
		this.totalAmount = totalAmount;
	}
	

}
