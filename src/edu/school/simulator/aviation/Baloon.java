package edu.school.simulator.aviation;

import edu.school.simulator.tower.WeatherTower;

public class Baloon extends Aircraft implements Flyable{

	Baloon(String name, Coordinates coordinates) {
		super(name, coordinates);
	}

	@Override
	public void updateConditions() {

	}

	@Override
	public void registerTower(WeatherTower weatherTower) {

	}

	@Override
	public String toString() {
		return "Baloon" + super.toString();
	}
}
