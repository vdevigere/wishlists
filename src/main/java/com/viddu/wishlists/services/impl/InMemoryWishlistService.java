package com.viddu.wishlists.services.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import com.viddu.wishlists.domain.Wishlist;
import com.viddu.wishlists.services.WishlistService;

public class InMemoryWishlistService implements WishlistService {

	private List<Wishlist> wishlists = new ArrayList<>();

	@Override
	public Optional<Wishlist> fetchById(UUID wishlistId) {
		return wishlists.stream().filter(wishlist -> wishlist.getId().equals(wishlistId)).findFirst();
	}

	@Override
	public List<Wishlist> fetchAll() {
		return wishlists;
	}

	@Override
	public Optional<Wishlist> createList(Wishlist newWishlist) {
		return (wishlists.add(newWishlist)) ? Optional.of(newWishlist) : Optional.empty();
	}

	@Override
	public boolean deleteById(UUID wishlistId) {
		return wishlists.removeIf(wishlist -> wishlist.getId().equals(wishlistId));
	}
}
