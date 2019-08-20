package com.cg.votingapp.service.main;
import java.util.Scanner;

import javax.naming.InvalidNameException;
import com.cg.votingapp.exception.InvalidAgeException;
import com.cg.votingapp.service.UserValidationImpl;
import com.cg.votingapp.service.ui.dto.UserValidationInput;

public class UserValidationMain {

	public static void main(String[] args) throws InvalidAgeException, InvalidNameException  {
		String name;
		int age;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter user name:\n");
		name= sc.next();
		System.out.println("Enter user age:\n");
		age= sc.nextInt();
		UserValidationImpl uv = new UserValidationImpl();
//		UserValidationInput uvi = new UserValidationInput();
//		uvi.getDetails();
		uv.userDetails(name, age);
			
		}

		
	}


