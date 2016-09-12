package com.iuri.active_bck.controller.event;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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
	
	@RequestMapping(method = RequestMethod.GET, produces="application/json")
	@ResponseBody
	public List<EventLocation> findAll(){
		return eventLocationService.findAll();
	}
	
	@RequestMapping(method = RequestMethod.DELETE, produces="application/json")
	@ResponseBody
	public void delete(@RequestParam Integer locationId, @RequestParam Integer eventType){
		eventLocationService.delete(locationId, eventType);
	}
	
	@RequestMapping(method = RequestMethod.GET, produces="application/json", params={"eventType"})
	@ResponseBody
	public List<EventLocation> findByEventType(@RequestParam Integer eventType){
		return eventLocationService.findByEventType(eventType);
	}
	
}
