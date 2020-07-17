/**
 * 
 */
package com.neeraj.qmanager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author neeraj
 *
 */
@Controller
public class IndexController {

	/*
	 * @RequestMapping("/") public String choseUser(HttpServletRequest request,
	 * HttpServletResponse response) { return "index"; }
	 */
	
	@RequestMapping(value = "usertype", method = RequestMethod.POST)
	public String chooseUser(@RequestParam(value = "cust", required = false) String cutomer,
			@RequestParam(value = "shop", required = false) String shopuser) {
		System.out.println(cutomer+" "+shopuser);
		if (cutomer != null) {
			return "users/userlogin";
		} else if (shopuser != null) {
			return "vendors/venderlogin";
		} else {
			return "";
		}
	}
	
	
}
