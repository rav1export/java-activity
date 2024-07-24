package com._export_test.TestOnly.controllers;

import org.springframework.web.bind.annotation.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Autowired;

import com._export_test.TestOnly.modal.User; 
import com._export_test.TestOnly.service.*; 

import java.util.List;
import java.util.HashMap;

@SpringBootApplication
@CrossOrigin(origins = {"*"})
@RestController
@RequestMapping("/users")
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
	        return userService.getUserById(id);
	    }

	    @PostMapping
	    public User createUser(@RequestBody User user) {
	        return userService.createUser(user);
	    }

	    @PutMapping("/{id}")
	    public User updateUser(@PathVariable Long id, @RequestBody User user) {
	        return userService.updateUser(id, user);
	    }

	    @DeleteMapping("/{id}")
	    public void deleteUser(@PathVariable Long id) {
	        userService.deleteUser(id);
	    }
}