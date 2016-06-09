package com.iuri.active_bck.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "rest/test")
public class Test {

	@RequestMapping(method = RequestMethod.GET)
	public void test(){
		System.out.println("test");
	}
	
}
