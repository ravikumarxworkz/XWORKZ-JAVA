package com.exam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.exam.modal.User;
import com.exam.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {

	@Autowired
	private UserService service;

	@GetMapping("/")
	public String home() {
		return "index";
	}

	@GetMapping("/home")
	public String home1() {
		return "index";
	}

	@PostMapping("/create")
	public String getMethodName(@ModelAttribute User user, Model model) {
		System.out.println("user from ui" + user);
		boolean save = this.service.createuser(user);
		if (save) {
			model.addAttribute("message", "data saved successfully");
			model.addAttribute("user", new User());
			return "index";
		}
		model.addAttribute("message", "data  not saved successfully");
		model.addAttribute("user", new User());
		return "index";
	}

	@GetMapping("/getAllUsers")
	public String getAllUsers(Model model) {
		List<User> users = this.service.getAllUsers();
		model.addAttribute("users", users);
		return "index";

	}

}
