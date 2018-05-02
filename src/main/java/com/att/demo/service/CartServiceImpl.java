package com.att.demo.service;

import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.att.demo.blogic.CartServiceManager;
import com.att.demo.model.Cart;



@Service
public class CartServiceImpl implements CartService{
	
	@Autowired
	private CartServiceManager cartManager;
	
	@Override
	public Response findCart(long id) {
		Cart returnCart = cartManager.findCart(id);
		
		if (returnCart != null) {
			return Response.noContent().build();
		} else {
			return Response.ok().entity(returnCart).build();
		}
	}

	@Override
	public Response saveCart(Cart cart) {
		Cart returnCart = cartManager.saveCart(cart);
		
		if (returnCart != null) {
			return Response.ok().entity("Cart Saved").build();
		} else {
			return Response.serverError().build();
					
		}
		
		
	}

	@Override
	public Response deleteCart(long id) {
		Cart returnCart = cartManager.deleteCart(id);
		
		if (returnCart != null) {
			return Response.ok().entity("Cart Deleted").build();
		} else {
			return Response.serverError().build();
					
		}
	}

	@Override
	public Response updateCart(Cart cart) {
		Cart returnCart = cartManager.updateCart(cart);
		
		if (returnCart != null) {
			return Response.ok().entity("Cart Updated").build();
		} else {
			return Response.serverError().build();
					
		}
	}	
	
}
