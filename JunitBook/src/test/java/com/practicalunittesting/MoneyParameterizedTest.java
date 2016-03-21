package com.practicalunittesting;

import static org.junit.Assert.assertEquals;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class MoneyParameterizedTest {
	private static final Object[] getMoney() {
		Object[] test_params_1 = { 10, "USD" };
		Object[] test_params_2 = { 15, "EUR" };
		Object[] all_test_params = { test_params_1, test_params_2 };
		return all_test_params;
	}

	@Test
	@Parameters(method = "getMoney")
	public void constructorShouldSetAmountAndCurrency(int amount,
			String currency) {
		Money money = new Money(amount, currency);

		assertEquals(amount, money.getAmount());
		assertEquals(currency, money.getCurrency());
	}
}
