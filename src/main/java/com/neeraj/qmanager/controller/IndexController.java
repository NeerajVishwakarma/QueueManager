/**
 * 
 */
package com.neeraj.qmanager.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author neeraj
 *
 */
@RequestMapping({"","/","home"})
@Controller
public class IndexController {

	public String choseUser(HttpServletRequest request,
            HttpServletResponse response) {
		
		return "";
	}
	
}
