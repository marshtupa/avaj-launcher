package edu.school.simulator.aviation;

import edu.school.simulator.tower.WeatherTower;

public class Baloon extends Aircraft implements Flyable{
	private WeatherTower weatherTower;

	Baloon(String name, Coordinates coordinates) {
		super(name, coordinates);
	}

	@Override
	public void updateConditions() {
		String weather = weatherTower.getWeather(coordinates);
		switch (weather) {
			case "SUN":
				coordinates.update(2, 0,   4);
			case "SNOW":
				coordinates.update(0, 0,  -5);
			case "RAIN":
				coordinates.update(0, 0,  -3);
			case "FOG":
				coordinates.update(0,  0, -15);
		}
		System.out.println(this.toString() + ": update conditions");
	}

	@Override
	public void registerTower(WeatherTower weatherTower) {
		this.weatherTower = weatherTower;
	}

	@Override
	public String toString() {
		return "Baloon" + super.toString();
	}
}
