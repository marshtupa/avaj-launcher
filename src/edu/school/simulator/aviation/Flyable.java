package edu.school.simulator.aviation;

import edu.school.simulator.tower.WeatherTower;

public interface Flyable {
    void updateConditions();
    void registerTower(WeatherTower weatherTower);
}
