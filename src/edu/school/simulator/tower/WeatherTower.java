package edu.school.simulator.tower;

import edu.school.simulator.aviation.Coordinates;
import edu.school.simulator.aviation.Flyable;

import java.util.LinkedList;

public class WeatherTower extends Tower {
    WeatherProvider provider;

    public WeatherTower(String filePath) {
        super.initTower(filePath);
        provider = provider.getProvider();
        setTower(this);
    }

    public int getWeather(Coordinates coordinates) {
        return provider.getCurrentWeather(coordinates);
    }

    void changeWeather() { }
}