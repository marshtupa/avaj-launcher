package edu.school.simulator.aviation;

import edu.school.simulator.tower.WeatherTower;

public class Helicopter extends Aircraft implements Flyable{

    Helicopter(String name, Coordinates coordinates) {
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
        return "Helicopter" + super.toString();
    }
}
