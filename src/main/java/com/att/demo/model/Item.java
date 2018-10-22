package com.att.demo.model;

import java.io.Serializable;

import javax.validation.constraints.Min;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

import io.swagger.annotations.ApiModel;

@ApiModel(value = "Item",
description = "Item domain object")
public class Item implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long itemId;
	@NotEmpty
	@NotBlank
	private String name;
	@Min(1)
	private int quantity;
	private Double price;
	@NotBlank
	private Long cartId;
	
	
	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Item(Long itemId, String name, int quantity, Double price, Long cartId) {
		super();
		this.itemId = itemId;
		this.name = name;
		this.quantity = quantity;
		this.price = price;
		this.cartId = cartId;
	}

	public Long getItemId() {
		return itemId;
	}
	
	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Long getCartId() {
		return cartId;
	}
	public void setCart(Long cartId) {
		this.cartId = cartId;
	}
	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", name=" + name + ", quantity=" + quantity + ", price=" + price + ", cartId="
				+ cartId + "]";
	}
}
