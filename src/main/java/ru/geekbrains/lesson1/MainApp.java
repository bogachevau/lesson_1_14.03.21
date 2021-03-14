package ru.geekbrains.lesson1;

/**
 * 1. Создать пустой проект в IntelliJ IDEA и прописать метод main().
 * 2. Создать переменные всех пройденных типов данных и инициализировать их значения.
 * 3. Написать метод, вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
 * где a, b, c, d – аргументы этого метода, имеющие тип float. (метод calc())
 * */


public class MainApp {

    public static float calc(){
        float a = 5.1f, b = 6.6f, c = 8.4f, d = 10.15f;
        return a*(b+(c/d));

    }

    public static void main(String[] args) {

        byte valueByte = 126;               // целочисленный тип данных -128..127
        boolean valueBool = true;           // логический тип данных
        short valueShort = -32768;          // целочисленный тип данных -32768..32767
        int valueInt = 100000;              // целочисленный тип данных
        long valueLong = 2_000_000_000L;    //целочисленный тип данных
        float valueFloat = 168.452f;        //вещественный тип данных
        double valueDouble = 159.357852;    // вещественный тип данных двойной точности
        char valueChar = 'k';               // символьный тип данных



        float result = calc();
        System.out.println("Результат " + result);

    }




}
