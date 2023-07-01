package de.telran.HomeWork;

import java.util.Scanner;

public class Practical {
    public static void main(String[] args) {
        float num1;
        float num2;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number one:");
        num1 = scanner.nextFloat();
        System.out.println("Enter a number two:");
        num2 = scanner.nextFloat();
        System.out.println(addition(num1, num2));

    }
    static float addition (float num1, float num2) {
        float sum  =  num1 +  num2;
        return  sum;
    }

}
