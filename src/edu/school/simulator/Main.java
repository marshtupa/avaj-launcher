package edu.school.simulator;

import edu.school.simulator.tower.WeatherTower;
import edu.school.simulator.tower.Simulation;

public class Main {

    public static void main(String[] args) {
        Simulation.startSimulation(new WeatherTower("scenario.txt"));
    }
}
