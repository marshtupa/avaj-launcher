package edu.school.simulator.tower;

import edu.school.simulator.aviation.Coordinates;
import java.util.Random;

public class WeatherProvider {
	private static WeatherProvider weatherProvider;
	private static int random = (int)(Math.random() * 10);

	private WeatherProvider() { }

	public static WeatherProvider getProvider() {
		if (weatherProvider == null) {
			weatherProvider = new WeatherProvider();
		}

		return weatherProvider;
	}

	public int getCurrentWeather(Coordinates coordinates) {
		int weatherIndex = (coordinates.mixCoordinates() % random) % 4;

		return weatherIndex;
	}
}
