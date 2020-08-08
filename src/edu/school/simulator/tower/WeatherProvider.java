package edu.school.simulator.tower;

import edu.school.simulator.aviation.Coordinates;

public class WeatherProvider {
	private WeatherProvider weatherProvider;
	private String weather;

	WeatherProvider() {
		weatherProvider = new WeatherProvider();
	}

	public WeatherProvider getProvider() {
		if (weatherProvider == null) {
			weatherProvider = new WeatherProvider();
		}

		return weatherProvider;
	}

	public String getCurrentWeather(Coordinates coordinates) {
		return "";
	}
}
