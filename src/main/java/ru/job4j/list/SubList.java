package ru.job4j.list;

import java.util.ArrayList;
import java.util.List;

public class SubList {
    public static List<String> getElementsBetweenIndexes(List<String> list, String el) {
        if (!list.contains(el) || list.indexOf(el) == list.lastIndexOf(el)) {
            return new ArrayList<>();
        }
        return list.subList(list.indexOf(el), list.lastIndexOf(el));
    }
}
