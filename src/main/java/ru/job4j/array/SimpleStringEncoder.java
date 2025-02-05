package ru.job4j.array;

public class SimpleStringEncoder {
    public static String encode(String input) {
        String result = "";
        char symbol = input.charAt(0);
        int counter = 1;
        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == symbol) {
                counter++;
            } else {
                result = result + getResult(symbol, counter);
                symbol = input.charAt(i);
                counter = 1;
            }
        }
        result = result + getResult(symbol, counter);
        return result;
    }

    private static String getResult(char symbol, int counter) {
        return "" + symbol + (counter == 1 ? "" : counter);
    }
}
