package ru.job4j.map;

import java.util.HashMap;
import java.util.Map;

public class NonUniqueString {
    public static Map<String, Boolean> checkData(String[] strings) {
        Map<String, Boolean> rsl = new HashMap<>();
        for (String string : strings) {
            rsl.put(string, rsl.get(string) != null);
        }
        return rsl;
    }
}
