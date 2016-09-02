package com.iuri.active_bck.util;

import groovy.lang.Singleton;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.transaction.annotation.Transactional;

import com.iuri.active_bck.constants.EventType;
import com.iuri.active_bck.entity.event.Event;
import com.iuri.active_bck.repository.event.EventRepository;

@Singleton
public class EventInactivationTask {

	@Autowired
	public EventRepository eventRepository;
	
	@Scheduled(cron = "0 0 12 * * ?")
	public void runScheduledTask() throws ParseException {
		inactivateEvents();
	}
	
	@PostConstruct
	public void runStartupTask() throws ParseException{
		inactivateEvents();
	}
	
	@Transactional(readOnly = false)
	public void inactivateEvents() throws ParseException{
		List<Event> eventList = (List<Event>) eventRepository.findAll();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		Date currentDate = new Date();
		for(Event event : eventList){
			Date eventDate = dateFormat.parse(event.getEventDate());
			if(eventDate.compareTo(dateFormat.parse(dateFormat.format(currentDate)))<0 && event.getEventStatus()==EventType.ACTIVE.getEventType()){
				event.setEventStatus(EventType.INACTIVE.getEventType());
				eventRepository.save(event);
			}
		}
	}
	
}
