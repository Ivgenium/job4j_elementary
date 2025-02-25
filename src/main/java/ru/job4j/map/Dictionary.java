package ru.job4j.map;

import java.util.*;

public class Dictionary {
    public static Map<String, List<String>> collectData(String[] strings) {
        Map<String, List<String>> rsl = new TreeMap<>();
        for (String string : strings) {
            rsl.put(string.substring(0, 1), rsl.getOrDefault(string.substring(0, 1), new ArrayList<>()));
            rsl.get(string.substring(0, 1)).add(string);
//            String key = string.substring(0, 1);
//            if (rsl.containsKey(key)) {
//                rsl.get(key).add(string);
//            } else {
//                rsl.put(key, new ArrayList<>());
//            }
        }
        return rsl;
    }
}
