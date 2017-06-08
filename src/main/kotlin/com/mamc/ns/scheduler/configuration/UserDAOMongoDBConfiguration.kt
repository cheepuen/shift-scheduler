package com.mamc.ns.scheduler.configuration

import com.mongodb.MongoClient
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.data.mongodb.MongoDbFactory
import org.springframework.data.mongodb.core.MongoTemplate
import org.springframework.data.mongodb.core.SimpleMongoDbFactory

@Configuration
class UserDAOMongoDBConfiguration() {
	
	@Bean
	@Qualifier("myFactory")
	fun mongoDbFactory() : MongoDbFactory {
		return SimpleMongoDbFactory(MongoClient(), "shift-scheduler")
	}

	@Bean
	@Qualifier("myTemplate")
	fun mongoTemplate():MongoTemplate{
		
		val mongoTemplate = MongoTemplate(mongoDbFactory());
		
		return mongoTemplate;

	}
	
}