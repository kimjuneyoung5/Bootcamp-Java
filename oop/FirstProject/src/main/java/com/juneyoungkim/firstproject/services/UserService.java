package com.juneyoungkim.firstproject.services;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.juneyoungkim.firstproject.models.User;
import com.juneyoungkim.firstproject.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepo;
	
	public User findByEmail(String email) {
		return userRepo.findByEmail(email);
	}
	
	public User findById(Long id) {
		return userRepo.findById(id).orElse(null);
	}
	
	public User registerUser(User user) {
		String hashedPass = BCrypt.hashpw(user.getPassword(), BCrypt.gensalt());
		user.setPassword(hashedPass);
		return userRepo.save(user);
	}
	
	public boolean authenticateUser(String email, String password) {
		User user = userRepo.findByEmail(email);
		if(user == null) {
			return false;
		}
		else {
			if(BCrypt.checkpw(password, user.getPassword())) {
				return true;
			}
			else {
				return false;
			}
		}
	}
	public User findUser(Long user_id) {
		return userRepo.findById(user_id).orElse(null);
	}
}

