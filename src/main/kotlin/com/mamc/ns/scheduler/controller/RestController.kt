package com.mamc.ns.scheduler.controller

import com.mamc.ns.scheduler.domain.User
import com.mamc.ns.scheduler.repository.UserDAO
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

@RestController
class ServiceController(@Autowired userManagementService : UserDAO ) {
	
	val userService = userManagementService
	
	@RequestMapping("/")
	fun indexTest():String {
		return "hello"
	}
	
	@RequestMapping(value = "/users", method = arrayOf(RequestMethod.POST) )
	fun addUser(@RequestBody user:User):List<User> {
		return userService.addUser(user)
	}
	
	@RequestMapping(method = arrayOf(RequestMethod.GET), value = "/users")
	fun getUser():List<String>{
		
		
		return listOf("hello", "hello", "how are you")
	}
}