package com.cg.votingapp.service;

import javax.naming.InvalidNameException;

import com.cg.votingapp.exception.InvalidAgeException;

public interface IUserValidation {
	public void userDetails(String name,int age)   ;
	//public void userAge(int age)  ;

}
