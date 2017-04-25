package com.viddu.wishlists;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import com.viddu.wishlists.config.JerseyConfig;
import com.viddu.wishlists.config.WishlistConfiguration;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@Import({JerseyConfig.class, WishlistConfiguration.class})
public class App {
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}
