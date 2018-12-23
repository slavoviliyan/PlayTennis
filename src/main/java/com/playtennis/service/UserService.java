package com.playtennis.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.playtennis.domain.User;
import com.playtennis.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userDao;
	
	public void createUser() {
		User user = new User();
		user.setUsername("Valio");
		
		userDao.save(user);
	}
}
