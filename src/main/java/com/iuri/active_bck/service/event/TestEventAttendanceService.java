package com.iuri.active_bck.service.event;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.iuri.active_bck.entity.event.TestEventAttendance;
import com.iuri.active_bck.repository.event.TestEventAttendanceRepository;

@Service
public class TestEventAttendanceService {

	@Autowired
	TestEventAttendanceRepository testEventAttendanceRepository;
	
	@Transactional(readOnly = false)
	public void save(TestEventAttendance testEventAttendance){
		testEventAttendanceRepository.save(testEventAttendance);
	}
	
	
}
