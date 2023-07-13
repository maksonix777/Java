package de.telran.HomeWork;


import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        double m;
        double n;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number:");
        m = scanner.nextDouble();

        System.out.println("Enter first number:");
        n = scanner.nextDouble();

        double diffM = m - 10;
        double diffN = n - 10;

        if (diffM < 0)
            diffM = -diffM;

        if (diffN < 0)
            diffN = -diffN;

        if (diffM < diffN) {
            System.out.println("Число " + m + " ближе к 10.");
        } else if (diffN < diffM) {
            System.out.println("Число " + n + " ближе к 10.");
        } else {
            System.out.println("Оба числа равноудалены от 10.");
        }

        scanner.close();

        //  if (m > 10 && n > 10  && m < n) {


    }
}
