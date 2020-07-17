package com.neeraj.qmanager.service;

import org.springframework.data.repository.CrudRepository;

import com.neeraj.qmanager.model.User;

public interface UserRepo extends CrudRepository<User, Integer> {

	public User findByUsernameAndPassword(String username, String password);

}
