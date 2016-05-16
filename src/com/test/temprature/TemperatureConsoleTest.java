package com.test.temprature;

import static org.junit.Assert.*;

import org.junit.Test;

import com.shailu.temperature.service.TemperatureService;

public class TemperatureConsoleTest {

	@Test
	public void testfahrenheitToCelsius() {
		TemperatureService temperatureService= new TemperatureService();
		assertEquals(71.6, temperatureService.celsiusToFahrenheit(22));;
	}

}
