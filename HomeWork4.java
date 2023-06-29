package de.telran.HomeWork;

import java.util.Scanner;

public class HomeWork4 {
    public static void main(String[] args) {

        float num1 ;
        float num2 ;

        System.out.println("Type in first number:");
        Scanner scanner = new Scanner(System.in);
        num1 = scanner.nextFloat();
// Action
        int action;
        System.out.println("choose an action: 1 for +, 2 for - , 3 for * , 4 for /");
        action = scanner.nextInt();


        System.out.println("Type in second number:");
        num2 = scanner.nextFloat();

//
        if (action == 1 ){
        System.out.println(addition(num1, num2));
        }

        if (action == 2){
        System.out.println (substruction(num1, num2));}

        if(action == 3) {
        System.out.println (multiplication(num1, num2));}

        if(action == 4) {
        System.out.println (divide(num1, num2));}


    }
    static float addition(float num1, float num2){
        float sum = num1 + num2;
        return sum;

     }
    static float substruction(float num1, float num2){
        float sum = num1 - num2;
        return sum;

    }

    static float multiplication(float num1, float num2){
        float sum = num1 * num2;
        return sum;

    }

    static float divide(float num1, float num2){
        float sum = num1 / num2;
        return sum;

    }
    }
