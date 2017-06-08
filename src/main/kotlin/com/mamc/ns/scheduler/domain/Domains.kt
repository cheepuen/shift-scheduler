package com.mamc.ns.scheduler.domain

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "users")
class User(){
	lateinit var userId: String
	lateinit var lastName:String
	lateinit var firstName: String
}

