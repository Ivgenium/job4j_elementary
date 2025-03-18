package ru.job4j.map;

import java.util.*;
import java.util.stream.Collectors;

public class AnalyzeHttpLog {
    public record Line(String level, String thread, String text) {
    }

    public static Map<String, Long> groupByLevel(List<Line> logs) {
        return logs.stream()
                .collect(Collectors.groupingBy(log -> log.level, Collectors.counting()));
    }

    public static String maxByThread(List<Line> logs) {
        return logs.stream()
                .collect(Collectors.groupingBy(log -> log.thread, Collectors.counting()))
                .entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .orElse(new AbstractMap.SimpleEntry<String, Long>("", null))
                .getKey();
    }

    public static Map<String, Long> detailByThread(List<Line> logs, String thread,
                                                   List<String> orders) {
        return logs.stream()
                .filter(log -> orders.contains(log.level) && log.thread.equals(thread))
                .collect(Collectors.groupingBy(log -> log.level, Collectors.counting()));
    }
}