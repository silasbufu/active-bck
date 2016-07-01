package com.iuri.active_bck.controller.user;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.iuri.active_bck.entity.user.Avatar;
import com.iuri.active_bck.service.user.AvatarService;


@Controller
@RequestMapping(value = "rest/avatar")
public class AvatarController {

	@Autowired
	AvatarService avatarService;
	
	@RequestMapping(method = RequestMethod.POST, consumes = "multipart/form-data", produces = "application/json")
	public void setAvatarUpload(@RequestParam("file") MultipartFile file,
			@RequestParam int userId, HttpServletResponse httpResponse) {
		Avatar avatar = new Avatar();
		avatar.setUserId(userId);
		try {
			avatar.setAvatar(file.getBytes());
		} catch (IOException e) {
			e.printStackTrace();
		}
		avatarService.saveAvatar(avatar);
	}
	
}
