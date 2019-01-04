package com.att.demo.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import io.swagger.annotations.ApiModel;

@ApiModel(value = "Cart",
description = "Cart domain object")
public class Cart implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	long cartId;
	Date createdDate;
	Date completedDate;
	List<Item> items;
	
	public Cart(long cartId, Date createdDate, Date completedDate) {
		super();
		this.cartId = cartId;
		this.createdDate = createdDate;
		this.completedDate = completedDate;
	}
	public long getCartId() {
		return cartId;
	}
	public void setCartId(long cartId) {
		this.cartId = cartId;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public Date getCompletedDate() {
		return completedDate;
	}
	public void setCompletedDate(Date completedDate) {
		this.completedDate = completedDate;
	}
	public List<Item> getItems() {
		return items;
	}
	public void setItem(List<Item> items) {
		this.items = items;
	}
	
	

}
