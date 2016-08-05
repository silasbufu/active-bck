package com.iuri.active_bck.controller.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.iuri.active_bck.entity.event.TestEventAttendance;
import com.iuri.active_bck.entity.json.TestEventAttendanceId;
import com.iuri.active_bck.entity.json.TestEventAttendanceJson;
import com.iuri.active_bck.service.event.TestEventAttendanceService;

@Controller
@RequestMapping(value = "rest/test-event-attendance")
public class TestEventAttendanceController {

	@Autowired
	TestEventAttendanceService testEventAttendanceService;
	
	@RequestMapping(method = RequestMethod.POST, produces="application/json")
	@ResponseBody
	public void save(@RequestBody TestEventAttendanceJson testEventAttendance){
		TestEventAttendance event = new TestEventAttendance();
		TestEventAttendanceId pk = new TestEventAttendanceId();
		pk.setUserId(testEventAttendance.getUserId());
		pk.setEventId(testEventAttendance.getEventId());
		event.setPk(pk);
		event.setUserAttendanceStatus(testEventAttendance.getUserAttendanceStatus());
		testEventAttendanceService.save(event);
	}
	
}
