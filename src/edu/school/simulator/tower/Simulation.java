package edu.school.simulator.tower;

public class Simulation {

	public static void startSimulation(WeatherTower weatherTower) {
		while (weatherTower.duration-- > 0) {
			weatherTower.conditionsChanged();
		}
	}
}
