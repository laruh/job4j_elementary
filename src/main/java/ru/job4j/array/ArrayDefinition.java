package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        String[] names = new String[4];
        names[0] = "Petr Arsentev";
        names[1] = "Igor Kovalkov";
        names[2] = "Vladimir Zhdanov";
        names[3] = "Maxim Bardakov";
        System.out.println("Ячейка 0: " + names[0]);
        System.out.println("Ячейка 1: " + names[1]);
        System.out.println("Ячейка 2: " + names[2]);
        System.out.println("Ячейка 3: " + names[3]);
        System.out.println("Размер массива ages равен: " + ages.length);
        System.out.println("Размер массива surnames равен: " + surnames.length);
        System.out.println("Размер массива prices равен: " + prices.length);
    }
}
