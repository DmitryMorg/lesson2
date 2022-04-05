/**
 * Java 1. Homework 2.
 *
 * @author Dmitry Morgachev
 * @version 01.04.2022
 */
package ru.gb.lesson2;

public class Homework2 {
    public static void main(String[] args) {
        System.out.println(sumCheck(2,66));

        printPosOrNeg(5);

        System.out.println(checkPosOrNeg(-2324));

        printString("Stop WAR!", 3);

        System.out.println(isYearLeap(2024));
    }

    static boolean sumCheck(int a, int b) {
        return a + b >= 10 && a + b <= 20;
    }

    static void printPosOrNeg(int a) {
        System.out.println(a >= 0? "Positive" : "Negative");
    }

    static boolean checkPosOrNeg(int a) {
        return a <= 0;
    }

    static void printString(String str, int count) {
        for (int a = 0; a < count; a++) {
            System.out.println(str);
        }
    }

    static boolean isYearLeap(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }
}
