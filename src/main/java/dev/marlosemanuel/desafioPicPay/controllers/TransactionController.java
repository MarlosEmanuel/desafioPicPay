package dev.marlosemanuel.desafioPicPay.controllers;

import dev.marlosemanuel.desafioPicPay.dto.TransactionRequest;
import dev.marlosemanuel.desafioPicPay.models.Transaction;
import dev.marlosemanuel.desafioPicPay.service.TransactionService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/transfer")
public class TransactionController {
    private final TransactionService transactionService;

    public TransactionController(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    @PostMapping
    public Transaction createTransaction(@RequestBody TransactionRequest transactionRequest) {
        return transactionService.createTransaction(
                transactionRequest.getSenderId(),
                transactionRequest.getRecipientId(),
                transactionRequest.getValue()
        );
    }
}
