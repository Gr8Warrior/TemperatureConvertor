package com.shailu.temperature.service;

import com.shailu.temperature.interfac.TemperatureInterface;

public class TemperatureService implements TemperatureInterface {

	@Override
	public double fahrenheitToCelsius(double fahrenheit) {
		// TODO Auto-generated method stub
		return ((fahrenheit - 32.0) * (5.0 / 9.0));
	}

	@Override
	public double celsiusToFahrenheit(double celsius) {
		// TODO Auto-generated method stub
		return (celsius * (9.0 / 5.0)) + 32.0;
	}

}
