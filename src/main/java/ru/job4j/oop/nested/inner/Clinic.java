package ru.job4j.oop.nested.inner;

public class Clinic extends City.Hospital {
    public Clinic(City city, String name) {
        city.super(name);
    }
}
