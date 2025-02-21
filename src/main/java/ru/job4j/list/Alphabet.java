package ru.job4j.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Alphabet {
    public static String reformat(String s) {
        List<String> list = Arrays.asList(s.split(""));
        list.sort(Comparator.naturalOrder());
        StringBuilder rsl = new StringBuilder();
        for (String element : list) {
            rsl.append(element);
        }
        return rsl.toString();
    }
}
