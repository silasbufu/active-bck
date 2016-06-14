package com.iuri.active_bck.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.iuri.active_bck.entity.TestEntity;


@Controller
@RequestMapping(value = "rest/test")
public class Test {

	@RequestMapping(method = RequestMethod.GET, produces="application/json")
	@ResponseBody
	public TestEntity test(){
		TestEntity testEntity = new TestEntity();
		testEntity.setTestString("dragos");
		return testEntity;
	}
	
}
