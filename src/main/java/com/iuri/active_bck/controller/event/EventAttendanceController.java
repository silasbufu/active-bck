package com.iuri.active_bck.controller.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.iuri.active_bck.entity.event.EventAttendance;
import com.iuri.active_bck.entity.json.EventAttendanceId;
import com.iuri.active_bck.entity.json.EventAttendanceJson;
import com.iuri.active_bck.service.event.EventAttendanceService;

@Controller
@RequestMapping(value = "rest/event-attendance")
public class EventAttendanceController {

	@Autowired
	EventAttendanceService testEventAttendanceService;
	
	@RequestMapping(method = RequestMethod.POST, produces="application/json")
	@ResponseBody
	public void save(@RequestBody EventAttendanceJson eventAttendance){
		EventAttendance event = new EventAttendance();
		EventAttendanceId pk = new EventAttendanceId();
		pk.setUserId(eventAttendance.getUserId());
		pk.setEventId(eventAttendance.getEventId());
		event.setPk(pk);
		event.setUserAttendanceStatus(eventAttendance.getUserAttendanceStatus());
		testEventAttendanceService.save(event);
	}
	
}
