package com.iuri.active_bck.service.event;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.iuri.active_bck.entity.event.EventAttendance;
import com.iuri.active_bck.repository.event.EventAttendanceRepository;

@Service
public class EventAttendanceService {

	@Autowired
	EventAttendanceRepository eventAttendanceRepository;
	
	@Transactional(readOnly = false)
	public void save(EventAttendance eventAttendance){
		eventAttendanceRepository.save(eventAttendance);
	}
	
	
}
