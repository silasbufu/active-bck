package com.iuri.active_bck.controller.user;

import java.util.HashMap;
import java.util.List;

import org.apache.commons.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.iuri.active_bck.entity.user.User;
import com.iuri.active_bck.service.user.UserService;

@Controller
@RequestMapping(value = "rest/user")
public class UserController {

	@Autowired
	UserService userService;
	
	@RequestMapping(method = RequestMethod.POST, produces="application/json")
	@ResponseBody
	public void save(@RequestBody User user){
		userService.save(user);
	}
	
	@RequestMapping(method = RequestMethod.GET, produces="application/json", params={"username"})
	@ResponseBody
	public HashMap<String, String> findByUsername(@RequestParam String username){
		User user = userService.findByUsername(username);
		HashMap<String, String> map = new HashMap<String, String>();
		if(user!=null){
			map.put("result", "1");
		}else{
			map.put("result", "0");
		}
		return map;
	}
	
	@RequestMapping(method = RequestMethod.GET, produces="application/json", params={"userId"})
	@ResponseBody
	public User findByUserId(@RequestParam int userId){
		return userService.findByUserId(userId);
	}
	
	@RequestMapping(method = RequestMethod.GET, produces="application/json", params={"username", "password"})
	@ResponseBody
	public User findByUsernameAndPassword(@RequestParam String username, @RequestParam String password){
		byte[] byteArrayPass = Base64.decodeBase64(password.getBytes());
		String decodedPass = new String(byteArrayPass);
		User user = userService.findByUsernameAndPassword(username, decodedPass);
		//pentru ca sunt prost
		if(user!=null){
			user.setPassword(password);
		}
		return user;
	}
	
	@RequestMapping(method = RequestMethod.GET, produces="application/json")
	@ResponseBody
	public List<User> findAllUsers(){
		return userService.findAll();
	}
	
}
