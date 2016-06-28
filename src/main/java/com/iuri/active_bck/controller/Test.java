package com.iuri.active_bck.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.iuri.active_bck.entity.TestEntity;
import com.iuri.active_bck.service.TestService;


@Controller
@RequestMapping(value = "rest/test")
public class Test {

	@Autowired
	TestService testService;
	
	@RequestMapping(method = RequestMethod.GET, produces="application/json")
	@ResponseBody
	public List<TestEntity> test(){
		return testService.getAllTestStrings();
	}
	
	@RequestMapping(method = RequestMethod.POST, produces="application/json")
	@ResponseBody
	public void save(@RequestBody TestEntity entity){
		testService.save(entity);
	}
	
}
