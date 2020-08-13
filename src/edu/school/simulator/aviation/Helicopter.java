package edu.school.simulator.aviation;

import edu.school.simulator.tower.Tower;
import edu.school.simulator.tower.WeatherTower;
import edu.school.simulator.utils.Logger;

public class Helicopter extends Aircraft implements Flyable {
    private WeatherTower weatherTower;
    int weatherRules[][] = {{10, 0,  2}, {5, 0,   0}, {1, 0,   0}, {0,  0, -12}};

    Helicopter(String name, Coordinates coordinates) {
        super(name, coordinates);
    }

    @Override
    public void updateConditions() {
        int weatherIndex = weatherTower.getWeather(coordinates);

        coordinates.update(weatherRules[weatherIndex]);
        Logger.logWeatherCondition(this, weatherTower.getWeather(coordinates));
    }

    @Override
    public void registerTower(Tower tower) {
        this.weatherTower = (WeatherTower)tower;
    }

    @Override
    public String toString() {
        return "Helicopter" + super.toString();
    }
}
