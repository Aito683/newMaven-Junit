package models;

public class Car {
    private String teamName;
    private String chassis;
    private String engine;
    private double weight; // in kg

    public Car(String teamName, String chassis, String engine, double weight) {
        this.teamName = teamName;
        this.chassis = chassis;
        this.engine = engine;
        this.weight = weight;
    }

    public String getTeamName() { return teamName; }
    public String getChassis() { return chassis; }
    public String getEngine() { return engine; }
    public double getWeight() { return weight; }
}
