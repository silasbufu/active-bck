package com.iuri.active_bck.service.event;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.iuri.active_bck.entity.event.TestEvent;
import com.iuri.active_bck.repository.event.TestEventRepository;

@Service
public class TestEventService {

	@Autowired
	TestEventRepository testEventRepository;
	
	@Transactional(readOnly = false)
	public void save(TestEvent testEvent){
		testEventRepository.save(testEvent);
	}
	
	@Transactional(readOnly = false)
	public void delete(Integer eventId){
		testEventRepository.delete(eventId);
	}
	
	@Transactional
	public List<TestEvent> findAll(){
		return (List<TestEvent>) testEventRepository.findAll();
	}
	
	@Transactional
	public List<TestEvent> findAllByEventType(Integer eventType){
		return (List<TestEvent>) testEventRepository.findAllByEventType(eventType);
	}
	
}
