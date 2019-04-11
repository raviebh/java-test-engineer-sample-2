package com.att.demo.resource;

import java.io.InputStream;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.web.bind.annotation.CrossOrigin;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ApiResponse;


/**
 * This is the Interface definition for Account mService
 * 
 * 
 */
@Api("cart")
@Path("/cart")
@Produces({MediaType.APPLICATION_JSON})
@CrossOrigin(origins = "*", allowedHeaders = "*")
public interface CartResource {	
    
	@GET
	@Path("user/findcart")
	@Produces({ MediaType.APPLICATION_JSON })
	@ApiOperation(
			value = "Respond Card <id>!",
			notes = "Returns a JSON object with a string to say Items in the Cart. ",
			response = CartResource.class
	)
	@ApiResponses(
			value = {
					@ApiResponse(code = 404, message = "Service not available"),
					@ApiResponse(code = 500, message = "Unexpected Runtime error")
					})
	public Response findCart(InputStream json);
	
	@POST
	@Path("user/savecart")
	@Produces({ MediaType.APPLICATION_JSON })
	@ApiOperation(
			value = "Respond Card <id>!",
			notes = "Returns a JSON object with a string to say Items in the Cart. ",
			response = CartResource.class
	)
	@ApiResponses(
			value = {
					@ApiResponse(code = 404, message = "Service not available"),
					@ApiResponse(code = 500, message = "Unexpected Runtime error")
					})
	public Response saveCart(InputStream json);
	
	
	@POST
	@Path("user/deletecart")
	@Produces({ MediaType.APPLICATION_JSON })
	@ApiOperation(
			value = "Respond Card <id>!",
			notes = "Returns a JSON object with a string to say Items in the Cart. ",
			response = CartResource.class
	)
	@ApiResponses(
			value = {
					@ApiResponse(code = 404, message = "Service not available"),
					@ApiResponse(code = 500, message = "Unexpected Runtime error")
					})
	public Response deleteCart(InputStream json);
	
	
	@POST
	@Path("user/updatecart")
	@Produces({ MediaType.APPLICATION_JSON })
	@ApiOperation(
			value = "Respond Card <id>!",
			notes = "Returns a JSON object with a string to say Items in the Cart. ",
			response = CartResource.class
	)
	@ApiResponses(
			value = {
					@ApiResponse(code = 404, message = "Service not available"),
					@ApiResponse(code = 500, message = "Unexpected Runtime error")
					})
	public Response updateCart(InputStream json);
	

	
}