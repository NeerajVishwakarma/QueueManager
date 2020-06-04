/**
 * 
 */
package com.neeraj.qmanager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

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
	
	@RequestMapping({"","/","/userindex"})
	public String userPageHandle(Model model) {
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
