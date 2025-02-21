package ru.job4j.list;

import java.util.List;

public class ArProgression {
    public static int checkData(List<Integer> data) {
        for (int i = 1; i < data.size() - 1; i++) {
            if ((data.get(i - 1) + data.get(i + 1)) / 2 != data.get(i)) {
                return 0;
            }
        }
        int sum = 0;
        for (int i = 0; i < data.size(); i++) {
            sum += data.get(i);
        }
        return sum;
    }
}
