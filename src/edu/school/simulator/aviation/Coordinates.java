package edu.school.simulator.aviation;

import static java.lang.Math.abs;

public class Coordinates {
    private int longitude;
    private int latitude;
    private int height;

    Coordinates(int longitude, int latitude, int height) {
        this.longitude = longitude;
        this.latitude = latitude;
        this.height = height;
    }

    public int getLongitude() {
        return longitude;
    }

    public int getLatitude() {
        return latitude;
    }

    public int getHeight() {
        return height;
    }

    public void update(int[] coordinates) {
        this.longitude += coordinates[0];
        this.latitude += coordinates[1];
        this.height += coordinates[2];
    }

    public int mixCoordinates() {
        return abs(getHeight() * (getLatitude() * getLongitude()));
    }

    @Override
    public String toString() {
        return "Coordinates{" +
                "longitude=" + longitude +
                ", latitude=" + latitude +
                ", height=" + height +
                '}';
    }
}
