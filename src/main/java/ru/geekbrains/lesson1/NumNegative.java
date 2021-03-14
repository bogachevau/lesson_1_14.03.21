package ru.geekbrains.lesson1;

/**
 *6. Написать метод, которому в качестве параметра передается целое число.
 * Метод должен вернуть true, если число отрицательное,
 * и вернуть false если положительное.
 * */

import java.util.Scanner;

public class NumNegative {

    static boolean isNegative(int value){
        return value < 0;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите любое целое число");
        int value = in.nextInt();
        System.out.println(isNegative(value));
    }
}
