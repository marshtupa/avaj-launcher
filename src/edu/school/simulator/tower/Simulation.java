package edu.school.simulator.tower;

import edu.school.simulator.utils.Logger;

public class Simulation {

	public static void startSimulation(WeatherTower weatherTower) {
		Logger logger = new Logger();
		while (weatherTower.duration-- > 0) {
			weatherTower.changeWeather();
			weatherTower.conditionsChanged();
		}
	}
}
