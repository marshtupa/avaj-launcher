package edu.school.simulator.aviation;

import edu.school.simulator.tower.WeatherTower;

public class JetPlane extends Aircraft implements Flyable{
    private WeatherTower tower;

    JetPlane(String name, Coordinates coordinates) {
        super(name, coordinates);
    }

    @Override
    public void updateConditions() {

    }

    @Override
    public void registerTower(WeatherTower weatherTower) {

    }
}
