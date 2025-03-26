package ru.job4j.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Experiment {
    public static void main(String[] args) {
        checkArrayList();
        checkLinkedList();
    }

    public static void checkArrayList() {
        long startTime = System.nanoTime();
        int capacity = 1000000;
        List<Integer> list = new ArrayList<>(capacity);
        for (int i = 0; i < capacity; i++) {
            list.add(i);
        }
        long endTime = System.nanoTime();
        System.out.printf("Время создания и заполнения ArrayList на %d элементов - %s\n", capacity, (double) (endTime - startTime) / 1000000);
        startTime = System.nanoTime();
        for (int i = 1000; i < 2000; i++) {
            list.remove(Integer.valueOf(i));
//            list.set(i, i);
//            list.indexOf(Integer.valueOf(i));
        }
        endTime = System.nanoTime();
        System.out.printf("Время удаления из ArrayList - %s\n", (double) (endTime - startTime) / 1000000);
        startTime = System.nanoTime();
        for (int i = 1000; i < 2000; i++) {
            list.set(i, i);
//            list.indexOf(Integer.valueOf(i));
        }
        endTime = System.nanoTime();
        System.out.printf("Время замены из ArrayList - %s\n", (double) (endTime - startTime) / 1000000);
        startTime = System.nanoTime();
        for (int i = 1000; i < 2000; i++) {
            list.indexOf(Integer.valueOf(i));
        }
        endTime = System.nanoTime();
        System.out.printf("Время поиска в ArrayList - %s\n", (double) (endTime - startTime) / 1000000);
    }

    public static void checkLinkedList() {
        long startTime = System.nanoTime();
        int capacity = 1000000;
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < capacity; i++) {
            list.add(i);
        }
        long endTime = System.nanoTime();
        System.out.printf("Время создания и заполнения LinkedList на %d элементов - %s\n", capacity, (double) (endTime - startTime) / 1000000);
        startTime = System.nanoTime();
        for (int i = 1000; i < 2000; i++) {
            list.remove(Integer.valueOf(i));
//            list.set(i, i);
//            list.indexOf(Integer.valueOf(i));
        }
        endTime = System.nanoTime();
        System.out.printf("Время удаления из LinkedList - %s\n", (double) (endTime - startTime) / 1000000);
        startTime = System.nanoTime();
        for (int i = 1000; i < 2000; i++) {
            list.set(i, i);
//            list.indexOf(Integer.valueOf(i));
        }
        endTime = System.nanoTime();
        System.out.printf("Время замены из LinkedList - %s\n", (double) (endTime - startTime) / 1000000);
        startTime = System.nanoTime();
        for (int i = 1000; i < 2000; i++) {
            list.indexOf(Integer.valueOf(i));
        }
        endTime = System.nanoTime();
        System.out.printf("Время поиска в LinkedList - %s\n", (double) (endTime - startTime) / 1000000);
    }
}