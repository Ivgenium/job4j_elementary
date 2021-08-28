package ru.job4j.array;

public class AlgoArray {
    public static void main(String[] args) {
        int[] array = new int[] {5, 3, 2, 1, 4};
        int temp = array[0];
        array[0] = array[3];
        array[3] = temp;
        int k = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if (j == i) {
                    temp = array[j];
                    k = j;
                }
                if (temp > array[j]) {
                    temp = array[j];
                    k = j;
                }
            }
            if (k != i) {
                temp = array[i];
                array[i] = array[k];
                array[k] = temp;
            }

        }
        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
    }
}
