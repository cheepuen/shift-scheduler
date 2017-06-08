package com.mamc.ns.scheduler.service

import org.springframework.stereotype.Component

@Component
class UserManagementService {
	
	enum class OperationResultEnum{SUCCESS, FAIL}
	
	fun createUser():OperationResultEnum{
		
		return OperationResultEnum.SUCCESS
	}
	
	fun removeUser():OperationResultEnum{
		return OperationResultEnum.SUCCESS
	}
	

}