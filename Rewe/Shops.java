package de.telran.HomeWork.Rewe;

import java.util.Scanner;

public class Shops {
    public static void main(String[] args) {
        int start1 , start2 , end1 , end2;
        start1 = 8;
        start2 = 12;
        end1 = 17;
        end2 = 22;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Сколько сейчас времени в часах: ");
        int hour = scanner.nextInt();
        boolean isEdekaOpen = edeka(start1, end1, hour);
        boolean isReweOpen = rewe(start2, end2, hour);


        if (hour < start1 || hour > end2) {
            System.out.println("Все магазины закрыты");
        } else System.out.println("Я могу купить еду, это: \n"
                + "isEdekaOpen: " + isEdekaOpen
                + "isReweOpen: " + isReweOpen);

    }
    static boolean edeka(int start1 , int end1, int hour) {
        boolean isEdekaOpen;
        if (hour >= start1 && hour < end1 ) {
            isEdekaOpen = true;
        } else {
            isEdekaOpen = false;
        }
        return isEdekaOpen;
    }
    static boolean rewe(int start2 , int end2, int hour) {
        boolean isReweOpen;
        if (hour >= start2 && hour < end2 ) {
            isReweOpen = true;
        } else {
            isReweOpen = false;
        }
        return isReweOpen;
    }
}