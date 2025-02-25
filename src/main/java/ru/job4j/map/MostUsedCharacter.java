package ru.job4j.map;

import java.util.*;

public class MostUsedCharacter {
    public static char getMaxCount(String str) {
        Map<Character, Integer> temp = new TreeMap<>();
        str = str.replaceAll(" ", "").toLowerCase();
        for (Character element : str.toCharArray()) {
            temp.putIfAbsent(element, 1);
            temp.computeIfPresent(element, (key, value) -> value + 1);
        }
        Integer max = Collections.max(temp.values());
        char rsl = ' ';
        for (Map.Entry<Character, Integer> entry : temp.entrySet()) {
            if (entry.getValue().equals(max)) {
                rsl = entry.getKey();
                break;
            }
        }
        return rsl;
    }
}
