package ru.job4j.oop.abstraction;

public abstract class Vehicle {
    private String brand;
    private String model;
    private String type;
    private int passengers;
    private int maxSpeed;

    private Vehicle() {
    }

    public abstract void accelerate();

    public abstract void steer();

    public abstract void brake();

    public abstract void test();
}
