package edu.school.simulator.aviation;

import edu.school.simulator.tower.Tower;

public interface Flyable {
    void updateConditions();
    void registerTower(Tower tower);
    String toString();
}
