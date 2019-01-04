package com.att.demo.resource;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.att.demo.model.Cart;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;


/**
 * This is the Interface definition for Account mService
 * 
 * 
 */
@Api("cart")
@Path("/cart")
@Produces({MediaType.APPLICATION_JSON})
public interface CartResource {


	@GET
	@Path("/get")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@ApiOperation(value = "Get list of Cart objects", notes ="Gets the list of all Cart objects", response = Cart.class, responseContainer = "")
	Cart getItems(long cartId);

	@POST
	@Path("/save")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@ApiOperation(value = "Save a new Cart object", notes ="Insert a new Cart object into the database, request should not contain an ID attribute", response = Cart.class, responseContainer = "")
	Cart saveCart(Cart cart);

	@PUT
	@Path("/update")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@ApiOperation(value = "Update an existing Cart object", notes ="Update an existing Cart object, should contain ID in the request", response = Cart.class, responseContainer = "")
	Cart updateCart(Cart cart);

	@DELETE
	@Path("/delete")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@ApiOperation(value = "Delete an existing Cart object", notes ="Delete an existing Cart object using the ID, if ID doesn't exist then method returns false", response = Object.class, responseContainer = "")
	Object deleteCart(long cartId);	
    

	
}