package com.iuri.active_bck.service.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.iuri.active_bck.entity.event.EventLocation;
import com.iuri.active_bck.repository.event.EventLocationRepository;

@Service
public class EventLocationService {

	@Autowired
	EventLocationRepository eventLocationRepository;
	
	@Transactional(readOnly = false)
	public void save(EventLocation eventLocation){
		eventLocationRepository.save(eventLocation);
	}
	
}
