package edu.school.simulator.tower;

import edu.school.simulator.aviation.Coordinates;

import java.util.Random;

public class WeatherProvider {
	static int random = new Random().ints(0, 4).findFirst().getAsInt();
	private WeatherProvider weatherProvider;
	private static String[] weather = {"SUN", "SNOW", "RAIN", "FOG"};

	private WeatherProvider() {
		weatherProvider = new WeatherProvider();
	}

	public WeatherProvider getProvider() {
		if (weatherProvider == null) {
			weatherProvider = new WeatherProvider();
		}

		return weatherProvider;
	}

	public String getCurrentWeather(Coordinates coordinates) {
		int index = coordinates.mixCoordinates() % random;

		return weather[index];
	}
}
