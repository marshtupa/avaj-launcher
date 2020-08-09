package edu.school.simulator.tower;

import edu.school.simulator.aviation.Coordinates;
import java.util.Random;

public class WeatherProvider {
	private static WeatherProvider weatherProvider;
	private static String[] weather = {"SUN", "SNOW", "RAIN", "FOG"};
	private static int random = new Random().ints(0, weather.length).findFirst().getAsInt();

	private WeatherProvider() { }

	public static WeatherProvider getProvider() {
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
