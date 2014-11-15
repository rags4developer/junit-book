package com.practicalunittesting.chp04;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PasswordValidatorTest {

	@Test
	public void must_check_password_min_size() {
		PasswordValidator passWordValidator = new PasswordValidator();
		assertTrue(passWordValidator.checkPasswordSize("pwd123"));
	}

}
