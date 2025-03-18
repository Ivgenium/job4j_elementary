package ru.job4j.collection;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class FreezeStr {
    public static boolean eq(String left, String right) {
        return textToMap(left).equals(textToMap(right));
    }

    private static Map<String, Long> textToMap(String text) {
        return Arrays.stream(text.split(""))
                .collect(Collectors.groupingBy(
                        word -> word,
                        Collectors.counting()
                ));
    }
}