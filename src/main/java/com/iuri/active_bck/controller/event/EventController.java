package com.iuri.active_bck.controller.event;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.iuri.active_bck.entity.event.Event;
import com.iuri.active_bck.service.event.EventService;

@Controller
@RequestMapping(value = "rest/event")
public class EventController {

	@Autowired
	EventService testEventService;
	
	//Save Event
	@RequestMapping(method = RequestMethod.POST, produces="application/json")
	@ResponseBody
	public void save(@RequestBody Event testEvent){
		testEventService.save(testEvent);
	}
	
	//Delete Event
	@RequestMapping(method = RequestMethod.DELETE, produces="application/json", params = {"eventId"})
	@ResponseBody
	public void delete(@RequestParam Integer eventId){
		testEventService.delete(eventId);
	}
	
	//All Events List
	@RequestMapping(method = RequestMethod.GET, produces="application/json")
	@ResponseBody
	public List<Event> findAll(){
		return testEventService.findAll();
	}
	
	//All Events By Type
	@RequestMapping(method = RequestMethod.GET, produces="application/json", params = {"eventType"})
	@ResponseBody
	public List<Event> findAllByEventType(@RequestParam Integer eventType){
		return testEventService.findAllByEventType(eventType);
	}
	
}
