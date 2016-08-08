package com.iuri.active_bck.controller.guest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.iuri.active_bck.entity.guest.Guest;
import com.iuri.active_bck.service.guest.GuestService;

@Controller
@RequestMapping(value = "rest/guest")
public class GuestController {

	@Autowired
	GuestService guestService;
	
	// Save Guest
	@RequestMapping(method = RequestMethod.POST, produces = "application/json")
	@ResponseBody
	public void save(@RequestBody Guest guest){
		guestService.save(guest);
	}
	
	@RequestMapping(method = RequestMethod.GET, produces = "application/json", params={"eventId"})
	@ResponseBody
	public List<Guest> findByEventId(Integer eventId){
		return guestService.findByEventId(eventId);
	}
	
}
