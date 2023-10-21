package com.example.demo.controller;

import com.example.demo.model.UserDto;
import com.example.demo.model.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
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

    @PostMapping
    public void addUser(@RequestBody UserDto userDTO) {
        // Lógica para agregar un nuevo usuario
    }

    @PutMapping("/{id}")
    public void updateUser(@PathVariable Long id, @RequestBody UserDto userDTO) {
        // Lógica para actualizar el usuario con el ID proporcionado
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id) {
        // Lógica para eliminar el usuario con el ID proporcionado
    }
}

