package org.example.lesson_1.Homework;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int num1 = sc.nextInt();
        while (num1 != 0){
            int num2 = sc.nextInt();
            if (isNumberPositiv(num1, num2)) {
                sum+=num1;
            }
            num1 = num2;
        }
        System.out.println("sum = " + sum);
    }

    /**
     * apiNote Дана последовательность целых чисел, оканчивающаяся нулем. Найти сумму положительных чисел, после которых следует отрицательное число.
     * @param a входящее целочисленное
     * @param b входящее целочисленное
     * @return Сумма требуюмых чисел
     */

    private static boolean isNumberPositiv(int a, int b) {
        return a > 0 && b < 0;
    }
}
