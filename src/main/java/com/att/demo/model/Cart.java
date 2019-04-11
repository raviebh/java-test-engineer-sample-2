package com.att.demo.model;

import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "Cart",
description = "Cart domain object")
public class Cart implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Long cartId;
	private String CreatedDate;
	private String CompletedDate;
	private String items;
	private String itemId;
	private String name;
	private long quantity;
	private long price;
	
	
	
	


	public Cart(Long cartId, String createdDate) {
		super();
		this.cartId = cartId;
		CreatedDate = createdDate;
	}

	public Long getCartId() {
		return cartId;
	}
	
	public void setCartId(Long cartId) {
		this.cartId = cartId;
	}
	public String getCreatedDate() {
		return CreatedDate;
	}
	public void setCreatedDate(String createdDate) {
		CreatedDate = createdDate;
	}
	public String getCompletedDate() {
		return CompletedDate;
	}
	public void setCompletedDate(String completedDate) {
		CompletedDate = completedDate;
	}
	public String getItems() {
		return items;
	}
	public void setItems(String items) {
		this.items = items;
	}
	public String getItemId() {
		return itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getQuantity() {
		return quantity;
	}
	public void setQuantity(long quantity) {
		this.quantity = quantity;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	
	
	
	

}


