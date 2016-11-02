package com.company;

import java.util.Scanner;

public class Uloha3 {

    public static void main(String[] args){
        double lowest = 0;
        System.out.println("Zadejte nejvyšší možné číslo k hádání:");
        Scanner sc = new Scanner(System.in);
        double highest = sc.nextInt();

        while(true){
            double tip = (lowest + highest)/2;
            tip = Math.round(tip);
            System.out.println("Můj tip je:");
            System.out.println(tip);
            sc = new Scanner(System.in);
            System.out.println("Jaké je tvoje číslo, možné odpovědi jsou 'vetsi', 'mensi', 'moje'");
            String comparison = sc.nextLine();


            if(comparison.equals("vetsi")){
                lowest = tip;
            }
            if(comparison.equals("mensi")){
                highest = tip;
            }
            if(comparison.equals("moje")){
                System.out.println("Ha, vyhrál jsem");
                break;
            }
            if(highest == lowest){
                System.out.println("Ty podvádíš, s tebou nehraju");
                break;
            }

        }
    }
}
