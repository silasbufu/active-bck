package com.iuri.active_bck.controller.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.iuri.active_bck.entity.event.EventLocation;
import com.iuri.active_bck.service.event.EventLocationService;

@Controller
@RequestMapping(value = "rest/event-location")
public class EventLocationController {

	@Autowired
	EventLocationService eventLocationService;
	
	@RequestMapping(method = RequestMethod.POST, produces="application/json")
	@ResponseBody
	public void save(@RequestBody EventLocation eventLocation){
		eventLocationService.save(eventLocation);
	}
	
}
