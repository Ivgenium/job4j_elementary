package ru.job4j.set;

import java.util.HashSet;
import java.util.Set;

public class Isogram {
    public static boolean checkString(String s) {
        Set<String> check = new HashSet<>();
        for (String element : s.split("")) {
            check.add(element);
        }
        return check.size() == s.length();
    }
}
