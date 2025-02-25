package ru.job4j.collection;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;

public class UniqueWordsFinder {

    // Метод для поиска уникальных слов в списке
    public List<String> findUniqueWords(List<String> words) {
        List<String> uniqueWords = new ArrayList<>();
        Map<String, Integer> temp = new LinkedHashMap<>();
        for (String word : words) {
            temp.putIfAbsent(word, 0);
            temp.put(word, temp.get(word) + 1);
        }
        for (Map.Entry<String, Integer> entry : temp.entrySet()) {
            if (entry.getValue() == 1) {
                uniqueWords.add(entry.getKey());
            }
        }
        return uniqueWords;
    }
}
