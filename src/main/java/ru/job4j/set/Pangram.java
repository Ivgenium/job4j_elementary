package ru.job4j.set;

import java.util.HashSet;
import java.util.Set;

public class Pangram {
    public static boolean checkString(String s) {
        Set<Character> rsl = new HashSet<>();
        for (Character character : s.toLowerCase().toCharArray()) {
            if (character != ' ') {
                rsl.add(character);
            }
        }
        return rsl.size() == 26;
    }
}
