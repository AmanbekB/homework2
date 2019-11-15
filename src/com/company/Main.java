package com.company;

import java.util.Scanner;
import java.util.Random;
public class Main {

    private static int age;

    public static int generateRandomAge(int min, int max){
        Random random = new Random();
        return random.nextInt((max-min)+1)+min;
    }

    public static void main(String[] args) {


        System.out.println(generateRandomAge(0,107));
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = in.next();
       // System.out.println("enter your age:");
        int age = generateRandomAge(0,107);
        System.out.println("enter temperature:");
        double temperature = in.nextDouble();


        if ((age < 46 && age > 19) && (temperature < 30 && temperature > -20)) {
            System.out.println("idem gulyat");
        }
        else if (age < 20 && (temperature > 0 && temperature < 28)) {
            System.out.println("Mojno gulyat birok atandan suran");
        }
        else if (age > 45&&(temperature>-10 && temperature<25)){
            System.out.println("temperatura teplaya mojno gulyat");
        }
    }
}
