package com.iuri.active_bck.service.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iuri.active_bck.entity.user.User;
import com.iuri.active_bck.repository.user.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository userRepository;
	
	public User findByUsernameAndPassword(String username, String password){
		return userRepository.findByUsernameAndPassword(username, password);
	}
	
	public User findByUsername(String username){
		return userRepository.findByUsername(username);
	}
	
	public void save(User user){
		userRepository.save(user);
	}
	
	public List<User> findAll(){
		return (List<User>) userRepository.findAll();
	}
		
}
