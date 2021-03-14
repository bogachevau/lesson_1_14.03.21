package ru.geekbrains.lesson1;

/**
 * 4. Написать метод, принимающий на вход два целых числа и проверяющий,
 * что их сумма лежит в пределах от 10 до 20 (включительно),
 * если да – вернуть true, в противном случае – false.
 * */

import java.util.Scanner;

public class ChekBul {

    public static boolean chekBool(int value){


        return value >= 10 && value <=20;

    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите два целых числа");
        int num1 = in.nextInt(); int num2 = in.nextInt();
        int value =  num1 + num2;
        System.out.println(chekBool(value));

    }

}
