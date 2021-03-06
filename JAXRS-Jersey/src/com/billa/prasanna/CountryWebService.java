package com.billa.prasanna;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/")
public class CountryWebService {
	
	CountryService countryService = new CountryService();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Country> getCountries(){
		List<Country> countries = countryService.getAllConutries();
		return countries;
		//return Response.status(200).entity(countries).build();
	}
	
	@GET
	@Path("country")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getCountryById(@QueryParam("id") int id) {
		Country country =countryService.getCountryId(id);
		return Response.status(200).entity(country).build();
	}
	
	@POST
	@Path("country")
	@Consumes({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	@Produces(MediaType.APPLICATION_JSON)
	public Response addCountry(Country country) {
		Country createdCountry = countryService.addCountry(country);
		return Response.status(201).entity(createdCountry).build();
	}
	
    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    public Response updateCountry(Country country){
        Country updatedCountry = countryService.updateCountry(country);
        return Response.status(201).entity(updatedCountry).build();
     }
    
    @DELETE
    @Produces(MediaType.APPLICATION_JSON)
    public Response deleteCountry(int id) {
    	        countryService.deleteCountry(id);
    	return Response.status(202).entity(id).build();
    }
    
}
