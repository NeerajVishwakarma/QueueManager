/**
 * 
 */
package com.neeraj.qmanager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.neeraj.qmanager.service.UserService;

/**
 * @author neeraj
 *
 */
@Controller
public class UserController {
	
	private final UserService userService;

	public UserController(UserService userService) {
		this.userService = userService;
	}
	
	@RequestMapping(value = "userlogin")
	public String userPageHandle() {
		return "userlogin";
	}
	
	@RequestMapping(value = "signin")
	public String signIn(@RequestParam(value = "username", required = false) String userId,
			@RequestParam(value = "password", required = false) String password) {
		System.out.println(userId);
		System.out.println(password);
//		return new ModelAndView("employee", "command", new Employee());
		return "userlogin";
	}
	
	@RequestMapping(value = "usersignup")
	public String signUp(@RequestParam(value = "signup", required = false) String signUp) {
		System.out.println(signUp);
		return "userlogin";
	}
	
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
