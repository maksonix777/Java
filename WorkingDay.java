package de.telran.HomeWork;

import java.util.Random;

//*Domashnee zadanie №2
//Est' ustrojstvo, na tablo kotorogo pokazyvaetsja kolichestvo sekund,
// ostavshihsja do konca rabochego dnja. Kogda rabochij den' nachinaetsja rovno v 9 chasov utra
 // — tablo otobrazhaet «28800» (t.e. ostajotsja 8 chasov), kogda 14:30 — na tablo «9000»
//(t.e. ostajotsja dva s polovinoj chasa),


public class WorkingDay {
    public static void main(String[] args) {
        Random random = new Random();
        int n = random.nextInt(28801); // Генерация случайного числа от 0 до 28800

        System.out.println("Осталось " + n + " секунд");

        int hours = n / 3600; // Вычисление количества полных часов

        if (hours >= 1) {
            System.out.println("Осталось " + hours + " час" + getHourSuffix(hours));
        } else {
            System.out.println("Осталось менее часа");
        }
    }

    // Вспомогательный метод для получения правильного окончания слова "час"
    private static String getHourSuffix(int hours) {
        if (hours % 10 == 1 && hours != 11) {
            return "";
        } else if ((hours % 10 == 2 || hours % 10 == 3 || hours % 10 == 4) && (hours < 10 || hours > 20)) {
            return "а";
        } else {
            return "ов";
        }
    }
}

//Sozdat' programmu, vyvodjashhuju na jekran blizhajshee k 10 iz dvuh chisel, zapisannyh v peremennye m i n.
//Chisla mogut byt', kak celochislennye, tak i drobnye.
//Naprimer :
//vvod : m=10.5, n=10.45
//vyvod: Chislo 10.45 blizhe k 10.

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
