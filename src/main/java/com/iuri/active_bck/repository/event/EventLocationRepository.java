package com.iuri.active_bck.repository.event;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.iuri.active_bck.entity.event.EventLocation;

public interface EventLocationRepository extends CrudRepository<EventLocation, Integer>{
	public List<EventLocation> findByEventType(Integer eventType);
}
