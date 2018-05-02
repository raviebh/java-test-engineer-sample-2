/**
 * 
 */
package com.att.demo.blogic;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.att.demo.model.Cart;

/**
 * LocalRepo.java
 *
 */
@Component
public class LocalRepo {
	
	private Map<Long,Cart> carts;
	
	private LocalRepo() {
		if ( carts == null) {
			carts = new HashMap<Long,Cart>();
		} 
	}
	
	public static LocalRepo  getInstance() {
		return new LocalRepo();
	}

	public Cart getCartById(long id) {
		
		return carts.get(id);
	}
	
	public Cart addCart(long id , Cart cart) {
		
		if ( cart == null) {
			return null;
		}
		return carts.put(id, cart);
	}
	
	public Cart updateCart(long id , Cart cart) {
		
		if ( cart == null) {
			return null;
		}
		
		return carts.put(id, cart);
	}
	
	public Cart removeCart(long id) {
		
		
		return carts.remove(id);
	}
	
}
