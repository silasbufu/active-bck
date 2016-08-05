package com.iuri.active_bck.repository.event;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.iuri.active_bck.entity.event.TestEvent;

public interface TestEventRepository extends CrudRepository<TestEvent, Integer>{
	@Query("from TestEvent e where event_type = ? order by event_date")
	public List<TestEvent> findAllByEventType(Integer eventType);
}
