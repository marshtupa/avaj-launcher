package edu.school.simulator.tower;

import edu.school.simulator.aviation.Coordinates;

public class WeatherProvider {
	private static WeatherProvider weatherProvider;
	private int seed;

	private WeatherProvider() { }

	public static WeatherProvider getProvider() {
		if (weatherProvider == null) {
			weatherProvider = new WeatherProvider();
		}

		return weatherProvider;
	}

	public int getCurrentWeather(Coordinates coordinates) {
		int weatherIndex = (coordinates.mixCoordinates() / seed) % 4;

		return weatherIndex;
	}

	protected void changeWeather() {
		seed = (int)(Math.random() * 10) + 1;
	}
}
