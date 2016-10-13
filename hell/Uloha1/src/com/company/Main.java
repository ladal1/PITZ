package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Zadejte jméno: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();

        System.out.println("Zadejte věk: ");
        sc = new Scanner(System.in);
        int vek = sc.nextInt();

        if(vek<18){
            System.out.println("Výpočet BMI pro mladší 18 let je nepřesný");
        }
        System.out.println("Zadejte váhu: ");
        sc = new Scanner(System.in);
        int kg = sc.nextInt();

        System.out.println("Zadejte výšku: ");
        sc = new Scanner(System.in);
        int m = sc.nextInt();
        int bmi = kg/(m*m);

        System.out.println("Jméno: " + name);
        switch(bmi){


        }

    }
}
