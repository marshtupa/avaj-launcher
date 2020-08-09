package edu.school.simulator.aviation;

import edu.school.simulator.tower.WeatherTower;

public class Helicopter extends Aircraft implements Flyable{
    private WeatherTower weatherTower;

    Helicopter(String name, Coordinates coordinates) {
        super(name, coordinates);
    }

    @Override
    public void updateConditions() {
        String weather = weatherTower.getWeather(coordinates);
        switch (weather) {
            case "SUN":
                coordinates.update(10, 0,   2);
            case "SNOW":
                coordinates.update(5, 0,   0);
            case "RAIN":
                coordinates.update(0, 1,   0);
            case "FOG":
                coordinates.update(0, 0, -12);
        }
        System.out.println(this.toString() + ": update conditions");
    }

    @Override
    public void registerTower(WeatherTower weatherTower) {
        this.weatherTower = weatherTower;
    }

    @Override
    public String toString() {
        return "Helicopter" + super.toString();
    }
}
