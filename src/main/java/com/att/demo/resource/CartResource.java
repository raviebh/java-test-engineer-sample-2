package com.att.demo.resource;

import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.http.ResponseEntity;

import com.att.demo.model.Cart;

import io.swagger.annotations.Api;


/**
 * This is the Interface definition for Account mService
 * 
 * 
 */
@Api("cart")
@Path("/cart")
@Produces({MediaType.APPLICATION_JSON})
public interface CartResource {	
    
//public List<Cart> getCart();
public ResponseEntity<?> findCartById(long id);
public ResponseEntity<?> saveCart(Cart cart);
public ResponseEntity<?> updateCart(Cart cart);
public void deleteCart(Cart cart);
	
}