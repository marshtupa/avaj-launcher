package edu.school.simulator;

import edu.school.simulator.tower.WeatherTower;
import edu.school.simulator.utils.Scenario;
import edu.school.simulator.utils.Simulation;

public class Main {

    public static void main(String[] args) {
        new WeatherTower("scenario.txt");
    }
}
