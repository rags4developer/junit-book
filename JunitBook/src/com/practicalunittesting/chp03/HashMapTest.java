package com.practicalunittesting.chp03;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;

import org.junit.BeforeClass;
import org.junit.Test;

public class HashMapTest {

	static HashMap<String, Integer> hm;
	static String s1;
	static String s2;
	static String s3;
	static Integer i1;
	static Integer i2;

	@BeforeClass
	public static void setUpBeforeClass() {

		hm = new HashMap<String, Integer>();
		s1 = new String("one");
		s2 = new String("one");
		s3 = "two";
		i1 = new Integer(1);
		i2 = new Integer(2);
	}

	@Test
	public void retrieveObject() {
		hm.put(s1, 1);
		assertEquals(i1, hm.get(s1));
	}

	@Test
	public void additionOfDuplicateKeyReplacesOldValue() {
		hm.put(s2, 2);
		assertEquals(i2, hm.get(s1));

	}

	@Test
	public void clearEmptiesHashMap() {
		hm.clear();
		assertEquals(0, hm.size());

	}

}
