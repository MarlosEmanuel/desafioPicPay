package dev.marlosemanuel.desafioPicPay.service;

import dev.marlosemanuel.desafioPicPay.dto.UserRequest;
import dev.marlosemanuel.desafioPicPay.exception.UserNotFoundException;
import dev.marlosemanuel.desafioPicPay.models.User;
import dev.marlosemanuel.desafioPicPay.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    //create a user
    public void createUser(User user) {
        userRepository.save(user);
    }

    // Find User
    public User findUserById(Long id) {
        return userRepository.findById(id)
                .orElseThrow(() -> new UserNotFoundException("Usuario não existe"));
    }

    public User editUser(Long id, User updateUser){
        User existingUser = findUserById(id);

        if(updateUser.getUsername() != null){
            existingUser.setUsername(updateUser.getUsername());
        }
        if(updateUser.getPassword()!= null){
            existingUser.setPassword(updateUser.getPassword());
        }
        if(updateUser.getEmail() != null){
            existingUser.setEmail(updateUser.getEmail());
        }

        return userRepository.save(existingUser);
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
