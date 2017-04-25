package com.viddu.wishlists.domain;

import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Wishlist {

	private final String name;

	private UUID id;

	public Wishlist(String name, UUID id) {
		this.name = name;
		this.id = id;
	}

	@JsonCreator
	public Wishlist(@JsonProperty("name") String name) {
		this(name, UUID.randomUUID());
	}

	public String getName() {
		return name;
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

}
