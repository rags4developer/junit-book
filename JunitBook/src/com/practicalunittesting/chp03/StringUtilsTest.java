package com.practicalunittesting.chp03;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringUtilsTest {

	@Test
	public void stringShouldBeReversed() {

		String s = new String("abcD");
		assertEquals("Dcba", StringUtils.reverse(s));
	}

}
