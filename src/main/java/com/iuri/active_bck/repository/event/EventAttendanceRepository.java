package com.iuri.active_bck.repository.event;

import org.springframework.data.repository.CrudRepository;

import com.iuri.active_bck.entity.event.EventAttendance;


public interface EventAttendanceRepository extends CrudRepository<EventAttendance, Integer>{
	
}
