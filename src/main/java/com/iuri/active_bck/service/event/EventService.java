package com.iuri.active_bck.service.event;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.iuri.active_bck.entity.event.Event;
import com.iuri.active_bck.repository.event.EventRepository;

@Service
public class EventService {

	@Autowired
	EventRepository eventRepository;
	
	@Transactional(readOnly = false)
	public void save(Event event){
		eventRepository.save(event);
	}
	
	@Transactional(readOnly = false)
	public void delete(Integer eventId){
		eventRepository.delete(eventId);
	}
	
	@Transactional
	public List<Event> findAll(){
		return (List<Event>) eventRepository.findAll();
	}
	
	@Transactional
	public List<Event> findAllByEventType(Integer eventType){
		return (List<Event>) eventRepository.findAllByEventType(eventType);
	}
	
}
