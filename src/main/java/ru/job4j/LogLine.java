package ru.job4j;

public class LogLine {
    public record Line(String level, String threads, String text) { }

    public Line parse(String text) {
        int firstWhiteSpace = 0;
        int secondWhiteSpace = 0;
        int count = 0;
        for (int i = 0; i < text.length() - 1; i++) {
            if (firstWhiteSpace == 0 && text.charAt(i) == '[') {
                firstWhiteSpace = i - 1;
                count++;
            } else if (text.charAt(i) == '[') {
                count++;
            } else if (text.charAt(i) == ']') {
                count--;
            } else if (firstWhiteSpace > 0 && count == 0) {
                secondWhiteSpace = i + 1;
                break;
            }
        }
        return new Line(text.substring(0, firstWhiteSpace),
                text.substring(firstWhiteSpace + 1, secondWhiteSpace - 1),
                text.substring(secondWhiteSpace, text.length()));
    }
}
