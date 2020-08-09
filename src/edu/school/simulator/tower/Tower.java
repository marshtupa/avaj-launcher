package edu.school.simulator.tower;

import edu.school.simulator.aviation.AircraftFactory;
import edu.school.simulator.aviation.Flyable;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Scanner;

abstract public class Tower {
    int duration;
    String[] params;
    LinkedList<Flyable> observers = new LinkedList<>();

    public void initTower(String filePath) {
        try {
            Scanner scanner = new Scanner(new File(filePath));

            if (scanner.hasNextLine()) {
                try {
                    duration = Integer.parseInt(scanner.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("Invalid count of steps");
                }
            }

            while (scanner.hasNextLine()) {
                String data = scanner.nextLine();
                params = data.split(" ");

                register(AircraftFactory.newAircraft(
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
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid data");
        } catch (Exception e) {
            System.out.println("No such aircraft type exists: " + e.getMessage());
        }
    }

    void register(Flyable flyable) {
        observers.add(flyable);
        System.out.println("Tower says: " + flyable.toString() + " registered to weather tower.");
    }

    void unregister(Flyable flyable) { }

    protected void conditionsChanged() { }
}
