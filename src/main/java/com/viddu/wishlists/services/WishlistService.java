package com.viddu.wishlists.services;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import com.viddu.wishlists.domain.Wishlist;

public interface WishlistService {
	public Optional<Wishlist> fetchById(UUID wishlistId);

	public List<Wishlist> fetchAll();

	public Optional<Wishlist> createList(Wishlist newWishlist);

	public boolean deleteById(UUID wishlistId);
}
