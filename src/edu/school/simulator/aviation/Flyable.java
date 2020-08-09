package edu.school.simulator.aviation;

import edu.school.simulator.tower.WeatherTower;

public interface Flyable {
    int flyableChangeRules[][][] = {{{0, 10,  2}, {10, 0,   2}, {2, 0,   4}},
            {{0,  5,  0},  {5, 0,   0}, {0, 0,  -5}},
            {{0,  1,  0},  {0, 1,   0}, {0, 0,  -3}},
            {{0,  0, -7},  {0, 0, -12}, {0, 0, -15}}};

    void updateConditions();
    void registerTower(WeatherTower weatherTower);
    String toString();
}
