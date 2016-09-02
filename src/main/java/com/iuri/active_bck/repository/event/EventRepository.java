package com.iuri.active_bck.repository.event;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.iuri.active_bck.entity.event.Event;

public interface EventRepository extends CrudRepository<Event, Integer>{
	@Query("from Event e where event_type = ? order by event_date")
	public List<Event> findAllByEventType(Integer eventType);
}
