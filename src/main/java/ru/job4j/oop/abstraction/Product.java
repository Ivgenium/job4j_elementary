package ru.job4j.oop.abstraction;

abstract class Product {
    public int multiplyBy;

    public Product(int multiplyBy) {
        this.multiplyBy = multiplyBy;
    }

    public int mutiply(int val) {
        return multiplyBy * val;
    }

    public static int mutiplyStatic(int val) {
        return val * val * val;
    }
}
