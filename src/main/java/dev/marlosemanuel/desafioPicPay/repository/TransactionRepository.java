package dev.marlosemanuel.desafioPicPay.repository;

import dev.marlosemanuel.desafioPicPay.models.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
}
