package com.company;

import java.util.Scanner;

public class Uloha1 {

    private static void bodyMassIndex(int weight, int height){
        float heightM =(float) height/100;
        float bmi =(float) weight/(heightM*heightM);
        if(bmi < 20){
            System.out.print(bmi);
            System.out.println(" -- Podváha");
        }
        else if(20<bmi && bmi<25){
            System.out.print(bmi);
            System.out.println(" -- Ideální váha");
        }
        else if(25<bmi && bmi<30){
            System.out.print(bmi);
            System.out.println(" -- Nadváha");
        }
        else if(30<bmi && bmi<35){
            System.out.print(bmi);
            System.out.println(" -- Obezita");
        }
        else if(35<bmi){
            System.out.print(bmi);
            System.out.println(" -- Těžká obezita");
        }
    }

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

        System.out.println("Zadejte výšku (cm): ");
        sc = new Scanner(System.in);
        int cm = sc.nextInt();

        System.out.println("Jméno: " + name);
        System.out.print("Váha: ");
        System.out.println(kg);
        System.out.print("Výška: ");
        System.out.println(cm);
        System.out.print("Body Mass Index: ");
        bodyMassIndex(kg, cm);

    }
}
