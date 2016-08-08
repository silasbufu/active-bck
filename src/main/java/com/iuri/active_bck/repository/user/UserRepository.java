package com.iuri.active_bck.repository.user;


import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.iuri.active_bck.entity.user.User;

public interface UserRepository extends CrudRepository<User, Integer>{
	public User findByUsernameAndPassword(String username, String password);
	public User findByUsername(String username);
	public User findByUserId(Integer userId);
	@Query("from User u join u.attendance a where a.pk.eventId = ? order by a.userAttendanceStatus")
	public List<User> findByEventId(Integer eventId);
}
