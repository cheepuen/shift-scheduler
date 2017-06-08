package com.mamc.ns.scheduler.service

class UserManagementService {
	
	enum class OperationResultEnum{SUCCESS, FAIL}
	
	fun createUser():OperationResultEnum{
		
		return OperationResultEnum.SUCCESS
	}
	
	fun removeUser():OperationResultEnum{
		return OperationResultEnum.SUCCESS
	}
	

}