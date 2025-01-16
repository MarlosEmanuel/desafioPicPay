package dev.marlosemanuel.desafioPicPay.models;

import dev.marlosemanuel.desafioPicPay.dto.UserRequest;
import jakarta.persistence.*;

@Entity
@Table(name = "Users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String cpf;
    private String email;
    private String password;
    private Boolean shopkeeper;
    private Double balance;
    public User() {}

    public User(String username, String cpf, String email, String password, Boolean shopkeeper, Double balance) {
        this.username = username;
        this.cpf = cpf;
        this.email = email;
        this.password = password;
        this.shopkeeper = shopkeeper;
        this.balance = balance;
    }

    //Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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



}
