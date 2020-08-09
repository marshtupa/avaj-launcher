package edu.school.simulator.aviation;

abstract public class Aircraft {
    protected long id;
    protected String name;
    protected Coordinates coordinates;
    private static long idCounter = 0;

    protected Aircraft(String name, Coordinates coordinates) {
        this.id = idCounter;
        this.name = name;
        this.coordinates = coordinates;
        setIdCounter(nextId());
    }

    private long nextId() {
        return ++idCounter;
    }

    public static void setIdCounter(long idCounter) {
        Aircraft.idCounter = idCounter;
    }

    @Override
    public String toString() {
        return "#" + name + "(" + id + ")";
    }
}
