package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;

@Controller
@RequestMapping(path="/user")
public class UserController {
	@Autowired
	private UserRepository u_repository;
	//@Autowired
    //private BCryptPasswordEncoder bCryptPasswordEncoder;
	@PostMapping(path="/add")
	public @ResponseBody String addUser(@RequestParam String email, @RequestParam String password) {
		User u=new User();
		u.setEmail(email);
		//String encryptedPassword = bCryptPasswordEncoder.encode(password);
		//u.setPassword(encryptedPassword);
		u.setPassword(password);
		u_repository.save(u);
		return "signed up successfully";
	}
	@GetMapping(path="/all")
	public @ResponseBody  Iterable<User> getAllUsers(){
		return u_repository.findAll();
	}
	
	@PostMapping(path="/resetpass")
	public @ResponseBody String updateUser(@RequestParam String email, @RequestParam String password) {
		User u=u_repository.findByEmail(email);
		if (u == null) {
	        return "User not found";
	    }
		u.setPassword(password);
		u_repository.save(u);
		return "reset successfully";
	}
/*	@PostMapping(path="/login")
	public ResponseEntity<String> loginUser(@RequestParam String email, @RequestParam String password) {
	    User user = u_repository.findByEmail(email);
	    if (user != null && bCryptPasswordEncoder.matches(password, user.getPassword())) {
	        return ResponseEntity.ok("Login successful");
	    } else {
	        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid credentials");
	    }
	}*/

	@PostMapping(path="/logout")
	public @ResponseBody String logoutUser(@RequestParam String email) {
		User u=u_repository.findByEmail(email);
		if (u == null) {
	        return "User not found";
	    }
		u_repository.delete(u);
		return " user logout successfully";
	}
	

}
