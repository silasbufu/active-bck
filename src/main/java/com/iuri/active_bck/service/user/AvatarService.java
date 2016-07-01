package com.iuri.active_bck.service.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.iuri.active_bck.entity.user.Avatar;
import com.iuri.active_bck.repository.user.AvatarRepository;

@Service
public class AvatarService {

	@Autowired
	AvatarRepository avatarRepository;
	
	@Transactional(readOnly = false)
	public void saveAvatar(Avatar avatar){
		avatarRepository.save(avatar);
	}
	
}
