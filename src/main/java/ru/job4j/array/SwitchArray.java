package ru.job4j.array;

public class SwitchArray {
    public static int[] swap(int[] array, int source, int dest) {
        int tem = array[source];
        array[source] = array[dest];
        array[dest] = tem;
        return array;
    }

    public static String[] swap(String[] array, int source, int dest) {
        String tem = array[source];
        array[source] = array[dest];
        array[dest] = tem;
        return array;
    }

    public static int[] swapBorder(int[] array) {
        int temp = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = temp;
        return array;
    }

    public static void main(String[] args) {
        int[] nums = new int[] {1, 2, 3, 4, 5, 6};
        int[] rsl = swapBorder(nums);
        for (int value : rsl) {
            System.out.println(value);
        }
    }
}
