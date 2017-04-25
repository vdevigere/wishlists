package com.viddu.wishlists.config;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import com.viddu.wishlists.endpoints.WishlistEndpoint;

@Component
public class JerseyConfig extends ResourceConfig {

	public JerseyConfig() {
		register(WishlistEndpoint.class);
	}
}
