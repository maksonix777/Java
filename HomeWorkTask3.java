package de.telran.HomeWork;

import java.util.Scanner;

public class HomeWorkTask3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//1
        System.out.print("Введите первое слово: ");
        String firstWord = scanner.next();





//2
        System.out.print("Введите второе слово: ");
        String secondWord = scanner.next();


        System.out.println(firstWord.length());
        System.out.println(secondWord.length());

        System.out.println(firstWord.substring(0,firstWord.length()/2) + secondWord.substring(secondWord.length()/2));

     //   System.out.println(firstWord.substring(firstWord.length()/2) + secondWord.substring(secondWord.length()/2));


    }
}
