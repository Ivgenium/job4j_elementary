package ru.job4j.comparator;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CommonNumberFinder {

    // Метод для поиска общего числа в трех списках
    public int findCommonNumber(List<Integer> list1, List<Integer> list2, List<Integer> list3) {
        // Вставьте вашу логику здесь
        list1.sort(Comparator.naturalOrder());
        list2.sort(Comparator.naturalOrder());
        list3.sort(Comparator.naturalOrder());
        int index1 = 0;
        int index2 = 0;
        int index3 = 0;
        while (index1 < list1.size() && index2 < list2.size() && index3 < list3.size()) {
            if (list1.get(index1).equals(list2.get(index2))
                    && list2.get(index2).equals(list3.get(index3))) {
                return list1.get(index1);
            }
            if (list1.get(index1).compareTo(list2.get(index2)) <= 0
                && list1.get(index1).compareTo(list3.get(index3)) <= 0) {
                index1++;
            } else if (list2.get(index2).compareTo(list1.get(index1)) <= 0
                    && list2.get(index2).compareTo(list3.get(index3)) <= 0) {
                index2++;
            } else if (list3.get(index3).compareTo(list1.get(index1)) <= 0
                    && list3.get(index3).compareTo(list2.get(index2)) <= 0) {
                index3++;
            }
        }
//        for (int num : list1) {
//            if (Collections.binarySearch(list2, num) >= 0 && Collections.binarySearch(list3, num) >= 0) {
//                return num;
//            }
//        }
        return -1; // Placeholder для случая, если общее число не найдено
    }
}
