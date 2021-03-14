package ru.geekbrains.lesson1;

import java.util.Scanner;

/**
 * 8. * Написать метод, который определяет, является ли год високосным,
 * и выводит сообщение в консоль. Каждый 4-й год является високосным,
 * кроме каждого 100-го, при этом каждый 400-й – високосный.
 * */

public class LeapYear {

    static void isLeap(int year){

        if (year % 400 == 0)
            System.out.println("Високосный год");
        else if (year % 100 == 0)
            System.out.println("Не високосный год");
        else if (year % 4 ==0)
            System.out.println("Високосный год");
        else System.out.println("Не високосный год");

    }

    public static void main(String[] args) {
        System.out.println("Введите год");
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        isLeap(year);
    }
}
