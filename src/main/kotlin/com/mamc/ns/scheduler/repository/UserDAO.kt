package com.mamc.ns.scheduler.repository

import com.mamc.ns.scheduler.domain.User
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.data.mongodb.core.MongoTemplate
import org.springframework.stereotype.Component

@Component
class UserDAO(@Autowired @Qualifier("myTemplate") mongoTemplate:MongoTemplate) {
	
	val mongoOperations = mongoTemplate;
	
	fun addUser(user:User): List<User>{
		mongoOperations.save(user)
		return mongoOperations.findAll(User::class.java)
	}
	
	
}