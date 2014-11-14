package com.practicalunittesting.chp04;

import org.junit.Test;

public class PasswordValidatorTest {

	@Test
	public void must_check_password_min_size() {
		PasswordValidator passWordValidator = new PasswordValidator();
		passWordValidator.checkPasswordSize("pwd123");
	}

}
