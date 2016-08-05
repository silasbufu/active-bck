package com.iuri.active_bck.service.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.iuri.active_bck.entity.user.User;
import com.iuri.active_bck.repository.user.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository userRepository;
	
	@Transactional
	public User findByUsernameAndPassword(String username, String password){
		return userRepository.findByUsernameAndPassword(username, password);
	}
	
	@Transactional
	public User findByUsername(String username){
		return userRepository.findByUsername(username);
	}
	
	@Transactional
	public User findByUserId(Integer userId){
		return userRepository.findByUserId(userId);
	}
	
	@Transactional(readOnly = false)
	public void save(User user){
		userRepository.save(user);
	}
	
	@Transactional
	public List<User> findAll(){
		return (List<User>) userRepository.findAll();
	}
	
	@Transactional
	public List<User> findByEventId(Integer eventId){
		return userRepository.findByEventId(eventId);
	}
	
		
}
