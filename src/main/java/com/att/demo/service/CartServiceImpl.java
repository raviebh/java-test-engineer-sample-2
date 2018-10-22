package com.att.demo.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.att.demo.model.Cart;
import com.att.demo.model.Item;



@Service("cartService")
public class CartServiceImpl implements CartService{

	@Override
	public Cart findCart(long id) {
		Map<Long, Cart> map = buildCart();
		return map.get(id);
	}

	@Override
	public void saveCart(Cart cart) {
		Map<Long, Cart> map = buildCart();
		map.put(cart.getCartId(), cart);
	}

	@Override
	public String deleteCart(long id) {
		Map<Long, Cart> map = buildCart();
		if (map.get(id) != null) {
			map.remove(id);
		return "success";
		} else return "fail";
		
	}

	@Override
	public Cart updateCart(Cart cart) {
		Map<Long, Cart> map = buildCart();
		if (map.get(cart.getCartId()) != null) {
			map.put(cart.getCartId(), cart);
		return cart;
		}
		else return null;
		
	}	
	
	private Map<Long, Cart> buildCart() {
		Map cartMap = new HashMap<Long, Cart>();
		List<Cart> cartList = new ArrayList<Cart>();
		List<Item> itemsList = new ArrayList<Item>();
		Item item1 = new Item(101L, "item1", 1, 20D, 1L);
		Item item2 = new Item(102L, "item2", 2, 20D, 1L);
		Item item3 = new Item(103L, "item3", 3, 30D, 1L);
		itemsList.add(item1);
		itemsList.add(item2);
		itemsList.add(item3);
		Cart cart1 = new Cart(1L, new Date(), new Date(), itemsList);
		List<Item> itemsList2 = new ArrayList<Item>();
		Item item4 = new Item(104L, "item4", 1, 20D, 2L);
		Item item5 = new Item(105L, "item5", 2, 20D, 2L);
		Item item6 = new Item(106L, "item6", 3, 30D, 2L);
		itemsList2.add(item4);
		itemsList2.add(item5);
		itemsList2.add(item6);
		Cart cart2 = new Cart(2L, new Date(), new Date(), itemsList2);
		cartList.add(cart1);
		cartList.add(cart2);
		cartMap.put(cart1.getCartId(), cart1);
		cartMap.put(cart2.getCartId(), cart2);
		return cartMap;
	}
	
}
