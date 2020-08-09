package edu.school.simulator.tower;

import edu.school.simulator.aviation.Coordinates;
import edu.school.simulator.aviation.Flyable;

import java.util.Random;

public class WeatherTower extends Tower{

    public WeatherTower(String filePath) {
        super.initTower(filePath);
        for (Flyable aircraft: observers) {
            System.out.println(aircraft.toString());
        }
    }

    public String getWeather(Coordinates coordinates) {
        return "";
    }

    void changeWeather() { }
}