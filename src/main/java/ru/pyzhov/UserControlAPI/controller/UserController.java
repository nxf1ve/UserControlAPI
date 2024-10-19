package ru.pyzhov.UserControlAPI.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.pyzhov.UserControlAPI.model.User;
import ru.pyzhov.UserControlAPI.service.UserService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/users")
@AllArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/{email}")
    public Optional<User> getUserByEmail(@PathVariable String email) {
        return userService.getUserByEmail(email);
    }

    @PostMapping("save_user")
    public User saveUser(@RequestBody User user) {
        return userService.saveUser(user);
    }

    @PutMapping("update_user")
    public User updateUser(@RequestBody User user) {
        return userService.updateUser(user);
    }

    @DeleteMapping("delete_user/{email}")
    public void deleteUser(@PathVariable String email) {
        userService.deleteUser(email);
    }

}
