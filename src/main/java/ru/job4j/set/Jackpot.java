package ru.job4j.set;

import java.util.HashSet;
import java.util.Set;

public class Jackpot {
    public static boolean checkYourWin(String[] combination) {
        Set<String> check = new HashSet<>();
        for (String s : combination) {
            check.add(s);
        }
        return check.size() == 1;
    }
}