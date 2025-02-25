package ru.job4j.stream;

import java.util.stream.Stream;

public class PipelineOutput {
    public static void main(String[] args) {
        Stream.of("one", "one", "two", "three")
                .peek(System.out::println)
                .distinct()
                .forEach(System.out::println);
    }
}