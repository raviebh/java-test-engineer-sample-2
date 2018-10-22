package com.att.demo.resource;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.Valid;
import javax.ws.rs.PathParam;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.att.demo.exception.CustomError;
import com.att.demo.model.Cart;
import com.att.demo.model.Item;
import com.att.demo.service.CartServiceImpl;

import io.swagger.models.Response;

/**
 * This is the Controller class for Account mService
 * 
 * 
 */
@Controller
public class CartResourceImpl implements CartResource {
	
	public static final Logger logger = LoggerFactory.getLogger(CartResourceImpl.class);
	@Autowired
	CartServiceImpl cartService;

@Override
@GetMapping("cart/{id}")
public ResponseEntity<?> findCartById(@PathParam(value = "id") long id) {
	try {
Cart cart = cartService.findCart(1L);
if (cart == null )
	return new ResponseEntity<CustomError>(
			new CustomError("Cart id is not found", "EC404"), HttpStatus.NOT_FOUND);
return new ResponseEntity<Cart>(cart, HttpStatus.OK);
	}
	catch(Exception e) {
		return new ResponseEntity<CustomError>(
				new CustomError(e.getMessage(), "ECF500"), HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
}

@Override
@PostMapping("saveCart/")
public ResponseEntity<?> saveCart(@Valid @RequestBody Cart cart) {
	if (cart == null)
		return new ResponseEntity<CustomError>(
				new CustomError("Cart can't be empty", "EC404"), HttpStatus.NOT_FOUND);
	try {
	cartService.saveCart(cart);
	return new ResponseEntity<Cart>(cart, HttpStatus.OK);
	} catch(Exception e) {
		return new ResponseEntity<CustomError>(
				new CustomError(e.getMessage(), "ECS500"), HttpStatus.INTERNAL_SERVER_ERROR);
	}
}

@Override
@PutMapping("updateCart/")
public ResponseEntity<?> updateCart(@Valid @RequestBody Cart cart) {
	if (cart == null)
		return new ResponseEntity<CustomError>(
				new CustomError("Cart can't be empty", "EC404"), HttpStatus.NOT_FOUND);
	try {
		Cart updCart = cartService.updateCart(cart);
		if (updCart == null )
			return new ResponseEntity<CustomError>(
					new CustomError("Cart id is not found", "EC404"), HttpStatus.NOT_FOUND);
		return new ResponseEntity<Cart>(cart, HttpStatus.OK);
		} catch(Exception e) {
			return new ResponseEntity<CustomError>(
					new CustomError(e.getMessage(), "ECU500"), HttpStatus.INTERNAL_SERVER_ERROR);
		}
}

@Override
public void deleteCart(Cart cart) {
	// TODO Auto-generated method stub
	
}


}