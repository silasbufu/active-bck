package com.iuri.active_bck.repository.user;

import org.springframework.data.repository.CrudRepository;

import com.iuri.active_bck.entity.user.User;

public interface UserRepository extends CrudRepository<User, Integer>{
	public User findByUsernameAndPassword(String username, String password);
	public User findByUsername(String username);
}
