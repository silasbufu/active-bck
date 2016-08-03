package com.iuri.active_bck.controller.user;

import java.io.IOException;


import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.iuri.active_bck.entity.user.User;
import com.iuri.active_bck.service.user.UserService;


@Controller
@RequestMapping(value = "rest/avatar")
public class AvatarController {

	@Autowired
	UserService userService;
	
	@RequestMapping(method = RequestMethod.POST, produces="application/json")
	@ResponseBody
	public void save(@RequestParam String user, @RequestParam(required = false, value="file") MultipartFile file) throws JsonParseException, JsonMappingException, IOException{
		ObjectMapper mapper = new ObjectMapper();
		User userObj = mapper.readValue(user, User.class);
		if(file!=null){
			try {
				userObj.setAvatar(file.getBytes());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		userService.save(userObj);
	}
	
}
