package com.viddu.wishlists.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.viddu.wishlists.services.WishlistService;
import com.viddu.wishlists.services.impl.InMemoryWishlistService;

@Configuration
public class WishlistConfiguration {

	@Bean
	public WishlistService wishlistService(){
		return new InMemoryWishlistService();
	}
}
