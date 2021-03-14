package ru.geekbrains.lesson1;

/**
 * 5. Написать метод, которому в качестве параметра передается целое число,
 * метод должен напечатать в консоль, положительное ли число передали
 * или отрицательное. Замечание: ноль считаем положительным числом.
 * */

import java.util.Scanner;

public class NumPositive {

    static void numPositive(int val){
        if (val>=0)
            System.out.println("Положительное число");
        else System.out.println("Отрицательное число");
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите любое целое число");
        int val = in.nextInt();
        numPositive(val);



    }
}
