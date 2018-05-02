package com.att.demo.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.att.demo.model.Cart;

import io.swagger.annotations.Api;

@Api
@Path("/cartService")
public interface CartService {
	
	@GET
	@Path("/getCart/{id}")
	Response findCart(long id);

	@POST
	@Path("/saveCart")
	@Consumes({ MediaType.APPLICATION_JSON })
	Response saveCart(Cart cart);

	@DELETE
	@Path("/removeCart/{id}")
	Response deleteCart(long id);

	@POST
	@Path("/updateCart")
	@Consumes({ MediaType.APPLICATION_JSON })
	Response updateCart(Cart cart);

}
