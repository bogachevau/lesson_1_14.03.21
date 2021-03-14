package ru.geekbrains.lesson1;

import java.util.Scanner;

/**
 * 7. Написать метод, которому в качестве параметра передается строка,
 * обозначающая имя. Метод должен вывести в консоль сообщение
 * «Привет, указанное_имя!».
 * */

public class Name {

    static void nameUser(String name){

        System.out.println("Привет, " + name + "!");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите Ваше имя");
        String name = in.nextLine();
        nameUser(name);
    }
}
