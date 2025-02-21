package ru.job4j.oop.nested.inner;

public class City {
    class Hospital {
        private static int temp;
        public String name;

        public Hospital(String name) {
            this.name = name;
        }
    }

    class Airport {
    }
}
