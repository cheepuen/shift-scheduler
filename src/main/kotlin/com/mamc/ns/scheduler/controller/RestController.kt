package com.mamc.ns.scheduler.controller

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.RequestMethod

@RestController
class ServiceController {
	
	
	
	@RequestMapping("/")
	fun indexTest():String {
		return "hello"
	}
	
	@RequestMapping(method = arrayOf(RequestMethod.GET), value = "/users")
	fun getUser():List<String>{
		
		
		return listOf("hello", "hello", "how are you")
	}
}