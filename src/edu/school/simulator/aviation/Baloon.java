package edu.school.simulator.aviation;

import edu.school.simulator.tower.Tower;
import edu.school.simulator.tower.WeatherTower;

public class Baloon extends Aircraft implements Flyable{
	private WeatherTower weatherTower;
	int weatherRules[][] = {{2, 0, 4}, {0, 0, -5}, {0, 0, -3}, {0,  0, -15}};

	Baloon(String name, Coordinates coordinates) {
		super(name, coordinates);
	}

	@Override
	public void updateConditions() {
		int weatherIndex = weatherTower.getWeather(coordinates);

		coordinates.update(weatherRules[weatherIndex]);
		System.out.println(this.toString() + ": update conditions");
	}

	@Override
	public void registerTower(Tower tower) {
		this.weatherTower = (WeatherTower)tower;
	}

	@Override
	public String toString() {
		return "Baloon" + super.toString();
	}
}
