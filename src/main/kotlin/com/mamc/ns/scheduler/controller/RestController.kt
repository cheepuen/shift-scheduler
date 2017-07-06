package com.mamc.ns.scheduler.controller

import com.mamc.ns.scheduler.domain.Employee
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

@RestController
class ServiceController() {
	
	
	@RequestMapping("/")
	fun indexTest():String {
		return "hello"
	}
	
	
	@RequestMapping(value = "/schedule", method = arrayOf(RequestMethod.POST) )
	fun addSchedule(@RequestBody employee: Employee):String {
		return "hello"
	}
	
	@RequestMapping(method = arrayOf(RequestMethod.GET), value = "/users")
	fun getUser():List<String>{
		
		return listOf("hello", "hello", "how are you")
	}
}