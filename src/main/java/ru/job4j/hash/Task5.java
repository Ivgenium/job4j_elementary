package ru.job4j.hash;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task5 {
    public static List<Integer> multiAssign(List<Task> tasks) {
        return tasks.stream()
                .collect(Collectors.groupingBy(task -> task.assignId, Collectors.summingInt(task -> task.taskId)))
                .entrySet().stream()
                .filter(task -> task.getValue() > 1)
                .map(Map.Entry::getKey)
                .toList();
    }

    public record Task(Integer taskId, Integer assignId) {
    }
}