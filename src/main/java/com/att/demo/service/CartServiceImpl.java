package com.att.demo.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

import org.springframework.stereotype.Service;

import com.att.demo.model.Cart;
import com.att.demo.model.Item;



@Service("cartService")
public class CartServiceImpl implements CartService{
	
	public static HashMap<Long, Cart> staticData = new HashMap<Long, Cart>();
	
	public CartServiceImpl(){
		Date created = new Date(), completed = new Date();
		Cart c1 = new Cart(1, created, completed);
		Cart c2 = new Cart(2, created, completed);
		Cart c3 = new Cart(3, created, completed);
		Cart c4 = new Cart(4, created, completed);
		Cart c5 = new Cart(5, created, completed);
		
		Item i1 = new Item(10,"Phone",1000,500.00);
		Item i2 = new Item(10,"Tablet",100,700.00);
		Item i3 = new Item(10,"Headset",100,50.00);
		Item i4 = new Item(10,"Laptop",250,1200.00);
		ArrayList<Item> staticList = new ArrayList<Item>();
		staticList.add(i1);
		staticList.add(i2);
		staticList.add(i3);
		staticList.add(i4);
		
		c1.setItem(staticList);
		c2.setItem(staticList);
		c3.setItem(staticList);
		c4.setItem(staticList);
		c5.setItem(staticList);
		
		staticData.put((long) 1, c1);
		staticData.put((long) 2, c2);
		staticData.put((long) 3, c3);
		staticData.put((long) 4, c4);
		staticData.put((long) 5, c5);
		
	}

	@Override
	public Cart findCart(long id) {
		return staticData.get(id);
	}

	
	
	/**
	 * Prem - changed the return type from void to Cart so that
	 * caller can avoid one more call get to updated data
	 *  
	 * @param cart
	 * @return
	 */
	@Override
	public Cart saveCart(Cart cart) {
		long newKey;
		/**
		 * Saving a new Cart object should not have ID attribute
		 * because it is generally auto generated
		 */
		if(cart.getCartId() > 0){
			/**
			 * Throw an ServiceException to denote the error
			 * For now returning null
			 */
			return null;
		}else{
			/**
			 * Quick and dirty logic to create a new key
			 * since we have hard coded the keys 1 through 5 in the static map
			 */
			do{
				newKey = (long) (Math.random()*100);
			}while(newKey > 6);
			
			staticData.put(newKey, cart);
		}
		return staticData.get(newKey);
	}

	@Override
	public boolean deleteCart(long id) {
		
		return false;
		
	}

	/**
	 * Prem - changed the return type from void to Cart so that
	 * caller can avoid one more call get to updated data
	 *  
	 * @param cart
	 * @return
	 */
	@Override
	public Cart updateCart(Cart cart) {
		if(staticData.containsKey(cart.getCartId())){
			staticData.put(cart.getCartId(), cart);
			return staticData.get(cart.getCartId());
		}
		return null;
	}	
	
}
