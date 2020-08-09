package edu.school.simulator.aviation;

import edu.school.simulator.tower.WeatherTower;

public class JetPlane extends Aircraft implements Flyable{
    private WeatherTower weatherTower;

    JetPlane(String name, Coordinates coordinates) {
        super(name, coordinates);
    }

    @Override
    public void updateConditions() {
        String weather = weatherTower.getWeather(coordinates);
        switch (weather) {
            case "SUN":
                coordinates.update(0, 10, 2);
            case "SNOW":
                coordinates.update(0,  5,  0);
            case "RAIN":
                coordinates.update(0,  1,  0);
            case "FOG":
                coordinates.update(0,  0, -7);
        }
        System.out.println(this.toString() + ": update conditions");
    }

    @Override
    public void registerTower(WeatherTower weatherTower) {
        this.weatherTower = weatherTower;
    }

    @Override
    public String toString() {
        return "JetPlane" + super.toString();
    }
}
