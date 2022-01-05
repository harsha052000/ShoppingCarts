package com.harsha.shopping.cartservice.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.harsha.shopping.cartservice.entity.Cart;

import java.util.Optional;

@Repository
public interface CartRepository extends MongoRepository<Cart, String> {

    Optional<Cart> findByCartId(int cartId);
    Cart findTopByOrderByCartIdDesc();

}
