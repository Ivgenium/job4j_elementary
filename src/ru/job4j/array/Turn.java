package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
        int temp, index;
        for (int i = 0; i < array.length; i++) {
            index = array.length - i - 1;
            if (i < index) {
                temp = array[i];
                array[i] = array[index];
                array[index] = temp;
            } else {
                break;
            }
        }
        return array;
    }
}
