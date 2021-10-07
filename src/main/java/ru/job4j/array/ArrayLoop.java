package ru.job4j.array;

public class ArrayLoop {
    public static void main(String[] args) {
        int[] mass = new int[5];
        for (int index = 0; index < mass.length; index++) {
            mass[index] = index * 2 + 3;
        }
        for (int value : mass) {
            System.out.println(value);
        }
    }
}
