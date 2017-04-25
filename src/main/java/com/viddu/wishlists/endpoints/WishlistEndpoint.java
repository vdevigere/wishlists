package com.viddu.wishlists.endpoints;

import java.util.List;
import java.util.UUID;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.viddu.wishlists.domain.Wishlist;
import com.viddu.wishlists.services.WishlistService;

@Component
@Path("/wishlists")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class WishlistEndpoint {

	@Autowired
	public WishlistEndpoint(WishlistService service) {
		this.service = service;
	}

	private final WishlistService service;

	@GET
	public List<Wishlist> fetchAll() {
		return service.fetchAll();
	}

	@GET
	@Path("/{id}")
	public Wishlist findById(@PathParam("id") UUID wishlistId) {
		return service.fetchById(wishlistId).orElse(null);
	}

	@POST
	public Wishlist createList(Wishlist newWishlist) {
		return service.createList(newWishlist).orElse(null);
	}

	@DELETE
	@Path("/{id}")
	public Boolean deleteById(@PathParam("id") UUID wishlistId) {
		return service.deleteById(wishlistId);
	}

}
