package de.telran.HomeWork.Rewe;

import java.util.Scanner;

public class Year {
    public static boolean isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            return true; // Год високосный
        } else {
            return false; // Год не високосный
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите год: ");
        int year = scanner.nextInt();
        scanner.close();

        boolean isLeap = isLeapYear(year);

        if (isLeap) {
            System.out.println(year + " является високосным годом.");
        } else {
            System.out.println(year + " не является високосным годом.");
        }
    }
}
