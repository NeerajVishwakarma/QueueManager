/**
 * 
 */
package com.neeraj.qmanager.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.neeraj.qmanager.model.User;
import com.neeraj.qmanager.service.UserRepo;
import com.neeraj.qmanager.service.UserService;

/**
 * @author neeraj
 *
 */
@Controller
public class UserController {
	
	@Autowired
	private final UserService userService;

	
	public UserController(UserService userService) {
		this.userService = userService;
	}

	/*
	 * @RequestMapping(value = "userlogin") public String userPageHandle() { return
	 * "userlogin"; }
	 */
	
	@GetMapping("/loginuser")
	public String signIn(@RequestParam(value = "username", required = false) String userId,
			@RequestParam(value = "password", required = false) String password) {
		System.out.println(userId);
		System.out.println(password);
//		return new ModelAndView("employee", "command", new Employee());
		return "userindex";
	}
	
	@GetMapping("/saveuser")
	public String saveUser(HttpServletRequest req) {
		return "users/usersignup";
	}

	@PostMapping("/save-user")
	public String saveNewUser(@ModelAttribute User user, BindingResult bindingResult, HttpServletRequest request) {
		System.out.println(user.getUsername());
		userService.saveUser(user);
		return "users/userlogin";
	}
	
	@PostMapping("/login-user")
	public String userLogin(Model model) {
		return "userindex";
	}
	
	public String userIndex(Model model) {
		return "userindex";
	}
	
	public String userSignUp(Model model) {
		return "userindex";
	}

}
