package dev.marlosemanuel.desafioPicPay.exception;

public class InsufficientBalance extends RuntimeException {
    public InsufficientBalance(String mensagem) {
        super(mensagem);
    }
}
