package com.cg.votingapp.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UserValidationImplTest {
	UserValidationImplTest uvit = new UserValidationImplTest();
	@Test
	void invalidAgeTest() {
		int result = uvit.userDetails("Samannita",23);
		
	}

}
