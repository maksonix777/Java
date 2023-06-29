package de.telran.HomeWork;

public class HomeWorkTask1 {
    public static void main(String[] args) {
        String myString =  new String("I study Basic Java");
       myMethode(myString);

    }
     static void myMethode (String myString) {

         System.out.println(myString);
         System.out.println(myString.charAt(myString.length()-2));
         System.out.println(myString.contains("Java"));
         System.out.println(myString.substring(14,18));

         String myJava = myString.substring(14,18);

         System.out.println(myJava);

         String myJovo = myJava.replaceAll("a", "o");
         System.out.println(myJovo);

         System.out.println(myJava.toUpperCase());
         System.out.println(myJava.toLowerCase());
    }




}
