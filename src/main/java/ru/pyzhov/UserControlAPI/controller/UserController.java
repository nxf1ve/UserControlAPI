package ru.pyzhov.UserControlAPI.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.pyzhov.UserControlAPI.model.User;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/users")
@AllArgsConstructor
public class UserController {

    public List<User> getAllUsers() {
        return null;
    }

    public Optional<User> getUserByEmail(String email) {
        return null;
    }

    public User saveUser(User user) {
        return null;
    }

    public User updateUser(User user) {
        return null;
    }

    public void deleteUser(String email) {
        // todo
    }

}
