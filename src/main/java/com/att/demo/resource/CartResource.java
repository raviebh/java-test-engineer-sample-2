package com.att.demo.resource;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

import com.att.demo.model.Cart;
import com.att.demo.model.Item;
import io.swagger.annotations.Api;


import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.http.ResponseEntity;

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
    @Path("/cart")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @ApiOperation(value = "Get Cart Details", notes = "", response = Cart.class, responseContainer = "Cart Object")
    ResponseEntity getCartDetails(
            @ApiParam(value = "Search By Cart ID", required = false) @QueryParam(value = "cartId") String cartId);

    @POST
    @Path("/cart")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @ApiOperation(value = "Get List of Users", notes = "List can be filtered by Name", response = Cart.class, responseContainer = "Cart Object")
    ResponseEntity addtoCart(@QueryParam(value = "cartId") String cartId , Item itemToAdd);

    @DELETE
    @Path("")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @ApiOperation(value = "Get List of Users", notes = "List can be filtered by Name", response = Cart.class, responseContainer = "Cart Object")
    ResponseEntity removeItemFromCart(@QueryParam(value = "cartId") String cartId, Item itemToRemove);


    @PUT
    @Path("/cart")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @ApiOperation(value = "Get List of Users", notes = "List can be filtered by Name", response = Cart.class, responseContainer = "Cart Object")
    ResponseEntity updateItemInCart(@QueryParam(value = "cartId") String cartId, Item itemToRemove);

}