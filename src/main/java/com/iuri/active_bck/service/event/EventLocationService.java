package com.iuri.active_bck.service.event;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.iuri.active_bck.constants.NumericBoolean;
import com.iuri.active_bck.entity.event.Event;
import com.iuri.active_bck.entity.event.EventLocation;
import com.iuri.active_bck.repository.event.EventLocationRepository;
import com.iuri.active_bck.repository.event.EventRepository;

@Service
public class EventLocationService {

	@Autowired
	EventLocationRepository eventLocationRepository;
	
	@Autowired
	EventRepository eventRepository;
	
	@Transactional(readOnly = false)
	public void save(EventLocation eventLocation){
		if(eventLocation.getDefaultLocation() == NumericBoolean.TRUE.getNumericBoolean()){
			List<EventLocation> locationList = (List<EventLocation>) eventLocationRepository.findByEventType(eventLocation.getEventType());
			for(EventLocation location : locationList){
				if(location.getDefaultLocation() == NumericBoolean.TRUE.getNumericBoolean()){
					location.setDefaultLocation(NumericBoolean.FALSE.getNumericBoolean());
					eventLocationRepository.save(location);
					break;
				}
			}
		}
		eventLocationRepository.save(eventLocation);
	}
	
	@Transactional(readOnly = false)
	public void delete(Integer locationId, Integer eventType){
		List<Event> eventList = (List<Event>) eventRepository.findAllByEventType(eventType);
		for(Event event : eventList){
			if(event.getLocationId() == locationId){
				eventRepository.delete(event.getEventId());
			}
		}
		eventLocationRepository.delete(locationId); 
	}
	
	@Transactional
	public List<EventLocation> findAll(){
		return (List<EventLocation>) eventLocationRepository.findAll();
	}
	
	@Transactional
	public List<EventLocation> findByEventType(Integer eventType){
		return eventLocationRepository.findByEventType(eventType);
	}
	
}
