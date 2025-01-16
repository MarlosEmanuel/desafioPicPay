package dev.marlosemanuel.desafioPicPay.controllers;

import dev.marlosemanuel.desafioPicPay.dto.UserRequest;
import dev.marlosemanuel.desafioPicPay.models.User;
import dev.marlosemanuel.desafioPicPay.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable Long id) {
        return userService.findUserById(id);
    }

    @PostMapping
    public void createUser(@RequestBody UserRequest user) {
        userService.createUser(user.toUser());
    }

    @PutMapping("/{id}")
    public void updateUser(@PathVariable Long id, @RequestBody UserRequest user) {
        userService.editUser(id, user.toUser());
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
    }
}
