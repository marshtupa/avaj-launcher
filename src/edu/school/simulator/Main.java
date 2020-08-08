package edu.school.simulator;

import edu.school.simulator.utils.Scenario;

public class Main {

    public static void main(String[] args) {
        Scenario scenario = new Scenario();

        scenario.readScenario("scenario.txt");
        return;
    }
}
