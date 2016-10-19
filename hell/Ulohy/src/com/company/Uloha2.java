package com.company;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Uloha2 {

    public static void main(String[] args){
        List<Integer> seznam = new ArrayList<>();
        System.out.println("Zadávejte čísla (konec udělejte 0): ");
        Scanner sc = new Scanner(System.in);
        int value;

        while(true){
            value = sc.nextInt();
            if(value != 0) {
                seznam.add(value);
                sc = new Scanner(System.in);
            }
            else{
                Collections.sort(seznam);
                double average = 0;
                for(int i : seznam) {
                    average = average + i;
                }
                System.out.print("Nejmenší číslo bylo: ");
                System.out.println(seznam.get(0));
                System.out.print("Největší bylo: ");
                System.out.println(seznam.get(seznam.size()-1));
                System.out.print("Průměr čísel byl: ");
                System.out.println(average/seznam.size());
                System.out.print("Seřazeno od nejmenšího po největší: ");
                System.out.println(seznam);
                break;
            }
        }
    }
}
