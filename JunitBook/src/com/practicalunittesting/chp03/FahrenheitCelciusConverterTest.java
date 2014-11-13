package com.practicalunittesting.chp03;

import static org.junit.Assert.assertEquals;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class FahrenheitCelciusConverterTest {

	public Object[] getInputsAndResults() {
		Integer[][] allInputs = new Integer[2][2];
		allInputs[0] = new Integer[] { 0, 32 };
		//allInputs[1] = new Integer[] { 37, 98 };//Reverse is actually {100, 37}
		allInputs[1] = new Integer[] { 100, 212 };
		return allInputs;
	}

	@Test
	@Parameters(method = "getInputsAndResults")
	public void shouldConvertCelciusToFahrenheit(int celcius,
			int correctFarenheit) {
		int farenheitResult = FahrenheitCelciusConverter.toFahrenheit(celcius);
		assertEquals(correctFarenheit, farenheitResult);
	}

	@Test
	@Parameters(method = "getInputsAndResults")
	public void shouldConvertFahrenheitToCelcius(int correctCelcius,
			int farenheit) {
		int celciusResult = FahrenheitCelciusConverter.toCelcius(farenheit);
		assertEquals(correctCelcius, celciusResult);
	}

}
