package ru.job4j.list;

import java.util.List;

public class RepositionElement {
    public static List<String> changePosition(List<String> list, int index) {
        if (list.isEmpty()) {
            System.out.println("Список пустой");
            return list;
        }
        String temp = list.remove(list.size() - 1);
        if (index > list.size() - 1) {
            return list;
        }
        list.set(index, temp);
        return list;
    }
}