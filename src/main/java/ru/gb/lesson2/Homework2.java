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
        printPosOrNeg();
        System.out.println(checkPosOrNeg(-2324));
        printString();
    }

    static boolean sumCheck(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }

    static void printPosOrNeg() {
        int a = 5;
        System.out.println(a >= 0? "Positive" : "Negative");
    }

    static boolean checkPosOrNeg(int a) {
        return a <= 0;
    }

    static void printString() {
        for (int a = 0; a < 3; a++) {
            System.out.println("Stop WAR!");
        }
    }
}
