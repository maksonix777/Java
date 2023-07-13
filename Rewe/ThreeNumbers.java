package de.telran.HomeWork.Rewe;

import java.util.Scanner;

public class ThreeNumbers {
    public static int findMaximum(int num1, int num2, int num3) {
        int max = num1;
        if (num2 > max) {
            max = num2;
        }
        if (num3 > max) {
            max = num3;
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите три целых числа: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        scanner.close();

        int maxNumber = findMaximum(num1, num2, num3);
        System.out.println("Максимальное число: " + maxNumber);
    }
}
