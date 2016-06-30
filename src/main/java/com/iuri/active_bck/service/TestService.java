package com.iuri.active_bck.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iuri.active_bck.entity.TestEntity;
import com.iuri.active_bck.repository.TestRepository;

@Service
public class TestService {

	@Autowired
	private TestRepository testRepository;
	
	public List<TestEntity> getAllTestStrings(){
		return (List<TestEntity>) testRepository.findAll();
	}
	
	public void save(TestEntity entity){
		testRepository.save(entity);
	}
	
}
