package ua.lviv.marazyncheck.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.lviv.marazyncheck.entity.Cart;
import ua.lviv.marazyncheck.entity.User;

import java.util.Optional;

public interface CartRepository extends JpaRepository<Cart, Integer> {
    Optional<Cart> findByUser(User user);
}
