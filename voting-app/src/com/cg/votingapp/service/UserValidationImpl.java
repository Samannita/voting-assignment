package com.cg.votingapp.service;
import java.util.regex.*;

import javax.naming.InvalidNameException;

import com.cg.votingapp.exception.InvalidAgeException;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserValidationImpl implements IUserValidation{
	
public void userDetails(String name,int age)  {
	
	
		try {
			if(name.matches("[A-Z]{1}[a-z]{4,19}"))
				System.out.println("valid name");
			
			else
				throw new InvalidNameException();
		} catch (InvalidNameException e) {
			
			System.err.println("Invalid name");;
		}
	

				try {
					if(age<18)
					throw new InvalidAgeException();
					else
						System.out.println("Eligible")	;
				} catch (InvalidAgeException e) {
					// TODO Auto-generated catch block
					System.err.println("Invalid age");
				}
			
				
		
		
	
}
}
