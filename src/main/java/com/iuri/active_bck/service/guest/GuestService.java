package com.iuri.active_bck.service.guest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.iuri.active_bck.entity.guest.Guest;
import com.iuri.active_bck.repository.guest.GuestRepository;

@Service
public class GuestService {

	@Autowired
	GuestRepository guestRepository;
	
	@Transactional(readOnly = false)
	public void save(Guest guest){
		guestRepository.save(guest);
	}
	
	@Transactional
	public List<Guest> findByEventId(Integer eventId){
		return guestRepository.findByEventId(eventId);
	}
	
	@Transactional(readOnly = false)
	public void delete(Integer guestId){
		guestRepository.delete(guestId);
	}
	
}
