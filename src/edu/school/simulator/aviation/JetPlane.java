package edu.school.simulator.aviation;

import edu.school.simulator.tower.Tower;
import edu.school.simulator.tower.WeatherTower;
import edu.school.simulator.utils.Logger;

public class JetPlane extends Aircraft implements Flyable{
    private WeatherTower weatherTower;
    int weatherRules[][] = {{0, 10,  2}, {0, 5,   0}, {0, 1,   0}, {0,  0, -7}};

    JetPlane(String name, Coordinates coordinates) {
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
        return "JetPlane" + super.toString();
    }
}
