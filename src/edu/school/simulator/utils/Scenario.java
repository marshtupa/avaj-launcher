package edu.school.simulator.utils;

import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import edu.school.simulator.aviation.AircraftFactory;
import edu.school.simulator.aviation.Flyable;

public class Scenario {
	int duration;
	String[] params;
	LinkedList<Flyable> aircrafts = new LinkedList<Flyable>();

	public void readScenario(String filePath) {
		try {
			File scenarioFile = new File(filePath);
			Scanner scanner = new Scanner(scenarioFile);

			if (scanner.hasNextLine()) {
				duration = Integer.parseInt(scanner.nextLine());
			}

			while (scanner.hasNextLine()) {
				String data = scanner.nextLine();
				params = data.split(" ");
				aircrafts.add(AircraftFactory.newAircraft(
						params[0],
						params[1],
						Integer.parseInt(params[2]),
						Integer.parseInt(params[3]),
						Integer.parseInt(params[4])));
			}
			scanner.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		} catch (NumberFormatException e) {
			System.out.println("Invalid coordinate");
		} catch (Exception e) {
			System.out.println("No such file exist: " + e.getMessage());
		}
	}
}
