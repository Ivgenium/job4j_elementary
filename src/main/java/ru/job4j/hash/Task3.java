package ru.job4j.hash;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Task3 {
    public static List<Integer> extractDuplicates(List<Integer> left, List<Integer> right) {
//        List<List<Integer>> temp = new ArrayList<>();
//        temp.add(left);
//        temp.add(right);
//        return temp.stream()
//                .flatMap(Collection::stream)
//                .distinct()
//                .filter(element -> left.contains(element) && right.contains(element))
//                .toList();
        List<Integer> temp = new  ArrayList<>(left);
        temp.retainAll(right);
        return temp;
    }
}