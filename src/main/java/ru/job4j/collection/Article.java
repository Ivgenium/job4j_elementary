package ru.job4j.collection;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Article {
    public static boolean generateBy(String origin, String line) {
//        Set<String> setOrigin = new HashSet<>(Arrays.asList(origin.split(" ")));
//        Set<String> setLine = new HashSet<>(Arrays.asList(line.split(" ")));
//        return setOrigin.containsAll(setLine);
//        List<String> listOrigin = new ArrayList<>(Arrays.asList(origin.split(" ")));
//        List<String> listLine = new ArrayList<>(Arrays.asList(line.split(" ")));
//        listOrigin.retainAll(listLine);
        boolean rsl = true;
        Map<String, Integer> mapOrigin = toMap(origin.replaceAll("\\pP", "").split(" "));
        Map<String, Integer> mapLine = toMap(line.split(" "));
        for (Map.Entry<String, Integer> entry : mapLine.entrySet()) {
            if (!mapOrigin.containsKey(entry.getKey())
                    || mapOrigin.get(entry.getKey()).compareTo(entry.getValue()) < 0)  {
                rsl = false;
                break;
            }
        }
        return rsl;
    }

    public static Map<String, Integer> toMap(String... example) {
        return Stream.iterate(0, i -> i < example.length, i -> i + 1)
                .collect(Collectors.toMap(i -> example[i], i -> 1, (s1, s2) -> s1 + 1));
    }
}
