package com.shailu.temperature.view;

import java.util.Scanner;

import com.shailu.temperature.interfac.TemperatureInterface;
import com.shailu.temperature.service.TemperatureService;

public class TemperatureConsole {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter \n\t 1).Conversion Fahrenheit to Celsius");
			System.out.println("\t 2).Conversion Celsius to Fahrenheit");
			int choice = sc.nextInt();
			TemperatureInterface temperatureInterface = new TemperatureService();
			switch (choice) {
			case 1:
				System.out.println("Enter temperature in Fahrenheit");
				double fahrenteit = sc.nextDouble();
				System.out.println("Temperature in Celsius :- " + temperatureInterface.fahrenheitToCelsius(fahrenteit));
				break;
			case 2:
				System.out.println("Enter temperature in Celsius");
				double Celsius = sc.nextDouble();
				System.out.println("Temperature in Fahrenheit :- " + temperatureInterface.celsiusToFahrenheit(Celsius));
				break;
			default:

				sc.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
