package ru.job4j.list;

import java.util.ArrayList;
import java.util.List;

public class GeomProgression {
    public static int generateAndSum(int first, int denominator, int count) {
        List<Integer> list = new ArrayList<>();
        list.add(first);
        for (int i = 1; i < count; i++) {
            list.add(first * (int) Math.pow(denominator, i));
        }
        Integer rsl = 0;
        for (Integer element : list) {
            rsl = rsl + element;
        }
//        int[] array = new int[count];
//        array[0] = first;
//        int rsl = first;
//        for (int i = 1; i < count; i++) {
//            array[i] = first * (int) Math.pow(denominator, i);
//            rsl += array[i];
//        }
        return rsl;
    }
}
