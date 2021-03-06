package ru.job4j.condition;

public class Point {

    public static double distance(int x1, int y1, int x2, int y2) {

        double first = Math.pow((x2 - x1), 2);

        double second = Math.pow((y2 - y1), 2);

        return Math.sqrt((first + second));
    }

    public static void main(String[] args) {

        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);

        double result1 = Point.distance(3, 0, 2, 7);
        System.out.println("result (3, 0) to (2, 7) " + result1);

        double result2 = Point.distance(0, -1, -4, 2);
        System.out.println("result (0, -1) to (-4, 2) " + result2);
    }

}
