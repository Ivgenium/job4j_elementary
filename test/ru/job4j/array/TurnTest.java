package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class TurnTest {

    @Test
    public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
        int[] input = new int[] {4, 1, 6, 2};
        int[] result = Turn.back(input);
        int[] expected = new int[] {2, 6, 1, 4};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenTurnArrayWithOddAmountOfElementsThenTurnedArray() {
        int[] input = new int[] {1, 2, 3, 4, 5};
        int[] result = Turn.back(input);
        int[] expected = new int[] {5, 4, 3, 2, 1};
        Assert.assertArrayEquals(expected, result);
    }

    public static class MinDiapasonTest {
        @Test
        public void whenFirstMin() {
            int[] array = new int[] {-1, 0, 5, 10};
            int start = 1;
            int finish = 3;
            int result = MinDiapason.findMin(array, start, finish);
            int expected = 0;
            Assert.assertEquals(expected, result);
        }

        @Test
        public void whenLastMin() {
            int[] array = new int[] {10, 5, 3, 1};
            int start = 1;
            int finish = 3;
            int result = MinDiapason.findMin(array, start, finish);
            int expected = 1;
            Assert.assertEquals(expected, result);
        }

        @Test
        public void whenMiddleMin() {
            int[] array = new int[] {10, 2, 5, 1};
            int start = 0;
            int finish = 2;
            int result = MinDiapason.findMin(array, start, finish);
            int expected = 2;
            Assert.assertEquals(expected, result);
        }
    }
}