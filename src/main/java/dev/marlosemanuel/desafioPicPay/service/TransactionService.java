package dev.marlosemanuel.desafioPicPay.service;

import dev.marlosemanuel.desafioPicPay.dto.UserRequest;
import dev.marlosemanuel.desafioPicPay.models.Transaction;
import dev.marlosemanuel.desafioPicPay.models.User;
import dev.marlosemanuel.desafioPicPay.repository.TransactionRepository;
import dev.marlosemanuel.desafioPicPay.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class TransactionService {
    private final TransactionRepository transactionRepository;
    private final UserRepository userRepository;

    public TransactionService(TransactionRepository transactionRepository, UserRepository userRepository) {
        this.transactionRepository = transactionRepository;
        this.userRepository = userRepository;
    }

    public Transaction createTransaction(Long senderId, Long recipientId, Double value) {
        User sender = userRepository.findById(senderId)
                .orElseThrow(() -> new IllegalArgumentException("Remetente não encontrado"));
        User recipient = userRepository.findById(recipientId)
                .orElseThrow(() -> new IllegalArgumentException("Destinatário não encontrado"));

        if (sender.getBalance() < value) {
            throw new IllegalStateException("Saldo insuficiente");
        }

        Transaction transaction = new Transaction();
        transaction.setSender(sender);
        transaction.setRecipient(recipient);
        transaction.setValue(value);
        transaction.setDate(LocalDate.now());

        sender.setBalance(sender.getBalance() - value);
        recipient.setBalance(recipient.getBalance() + value);

        userRepository.save(sender);
        userRepository.save(recipient);
        return transactionRepository.save(transaction);
    }
}
