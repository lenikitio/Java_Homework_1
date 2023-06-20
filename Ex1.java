package org.example.lesson_1.Homework;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String newString = sc.nextLine();
        System.out.println(String.join(" ", GetReverse(newString)));
    }

    /**
     * apiNote Получив входную строку s, измените порядок слов в обратном порядке.
     * @param newString исходная строка
     * @return результирующая строка
     */
    private static String[] GetReverse(String newString) {
        String[] list = newString.split(" ");
        for(int i = 0; i < list.length / 2; i++){
            String value = list[list.length - i - 1];
            list[list.length - i - 1] = list[i];
            list[i] = value;
        }
        return list;
    }
}
