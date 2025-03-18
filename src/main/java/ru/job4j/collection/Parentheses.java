package ru.job4j.collection;

public class Parentheses {
    public static boolean valid(char[] data) {
        int count = 0;
        for (char element : data) {
            if (element == '(') {
                count++;
            } else if (element == ')') {
                if (count > 0) {
                    count--;
                } else {
                    count--;
                    break;
                }
            }
        }
        return count == 0;
    }
}