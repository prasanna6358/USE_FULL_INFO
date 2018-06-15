package com.billa.prasanna;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/")
public class MessageService {
	
	@GET
	@Path("message")
	@Produces(MediaType.TEXT_PLAIN)
	public Response getMessage(@QueryParam("msg") String message) {
		return Response.status(200).entity("WebService consuming "+message).build() ;
	}
	
}
