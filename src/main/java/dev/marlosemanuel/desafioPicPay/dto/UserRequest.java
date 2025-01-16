package dev.marlosemanuel.desafioPicPay.dto;

import dev.marlosemanuel.desafioPicPay.models.User;

public class UserRequest {

    private String username;
    private String cpf;
    private String email;
    private String password;
    private Boolean shopkeeper;
    private Double balance;

    public User toUser() {
        return new User(
                this.username,
                this.cpf,
                this.email,
                this.password,
                this.shopkeeper,
                this.balance
        );
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getShopkeeper() {
        return shopkeeper;
    }

    public void setShopkeeper(Boolean shopkeeper) {
        this.shopkeeper = shopkeeper;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "UserRequest{" +
                "username='" + username + '\'' +
                ", cpf='" + cpf + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", shopkeeper=" + shopkeeper +
                ", balance=" + balance +
                '}';
    }


}
