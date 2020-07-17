/**
 * 
 */
package com.neeraj.qmanager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.neeraj.qmanager.model.User;

/**
 * @author neeraj
 *
 */
@Service
@Transactional
public class UserService{

	private final UserRepo userRepo;
	
	@Autowired
	public UserService(UserRepo userService) {
		this.userRepo=userService;
	}
	
	public void saveUser(User user) {
		this.userRepo.save(user);
	}
	
	public User findUser(String userName, String password) {
		return userRepo.findByUsernameAndPassword(userName, password);
	}
}
