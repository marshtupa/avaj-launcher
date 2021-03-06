package edu.school.simulator.aviation;

public class AircraftFactory {
	public static Flyable newAircraft(String type, String name, int longitude, int latitude, int height) throws Exception {
		validateData(longitude, latitude, height);

		switch (type) {
			case "Helicopter":
				return new Helicopter(name, new Coordinates(longitude, latitude, height));
			case "JetPlane":
				return new JetPlane(name, new Coordinates(longitude, latitude, height));
			case "Baloon":
				return new Baloon(name, new Coordinates(longitude, latitude, height));
			default:
				throw new Exception(type);
		}
	}

	static void validateData(int longitude, int latitude, int height) {

	}
}
