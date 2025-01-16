package dev.marlosemanuel.desafioPicPay.exception;

public class AuthorizationDenied extends RuntimeException {
    public AuthorizationDenied(String mensagem) {
        super(mensagem);
    }
}
