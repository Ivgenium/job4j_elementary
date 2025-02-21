package ru.job4j.set;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class Firewall {
    public static String checkName(String s, Set<String> words) {
//        List<String> list = Arrays.asList(s.split(" "));
//        for (String element : list) {
//            if (words.contains(element)) {
//                return "Выберите другую статью...";
//            }
//        }
        for (String word : words) {
            if (s.contains(word)) {
                return "Выберите другую статью...";
            }
        }
        return "Вы сделали правильный выбор!";
    }
}
