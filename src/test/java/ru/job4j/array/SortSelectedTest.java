package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSort1() {
        int[] data = new int[] {5, 9, 7};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {5, 7, 9};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSort2() {
        int[] data = new int[] {18, 6, 5, 1, 11};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 5, 6, 11, 18};
        Assert.assertArrayEquals(expected, result);
    }
}