package dev.marlosemanuel.desafioPicPay.repository;

import dev.marlosemanuel.desafioPicPay.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
