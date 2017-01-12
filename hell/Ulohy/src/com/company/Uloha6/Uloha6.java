package com.company.Uloha6;

import java.util.*;
import com.company.Uloha6.*;
import static java.util.Collections.sort;


public class Uloha6 {
    public static void main (String[] args){
        List<Tvar> seznam = new ArrayList<>();
        boolean run = true;
        double a = 0;
        double b = 0;
        double c = 0;
        double soucet = 0;
        while(run) {
            menu();
            soucet = 0;
            Scanner sc = new Scanner(System.in);
            switch (sc.nextInt()){
                case 0: run = false;
                        break;
                case 1: ctverec newCtverec = new ctverec();
                        seznam.add(newCtverec);
                        System.out.println("Zadej A");
                        a = sc.nextDouble();
                        newCtverec.setObsah(a, 0, 0);
                        break;
                case 2: System.out.println("Zadej A");
                        a = sc.nextDouble();
                        System.out.println("Zadej B");
                        b = sc.nextDouble();
                        if (a==b){
                            ctverec newCtverec2 = new ctverec();
                            newCtverec2.setObsah(a, 0, 0);
                            break;
                        }
                        else{
                            obdelnik newObdelnik = new obdelnik();
                            seznam.add(newObdelnik);
                            newObdelnik.setObsah(a, b, 0);
                            break;
                        }
                case 3: trojuhelnik newTrojuhelnik = new trojuhelnik();
                        seznam.add(newTrojuhelnik);
                        System.out.println("Zadej A");
                        a = sc.nextDouble();
                        System.out.println("Zadej B");
                        b = sc.nextDouble();
                        System.out.println("Zadej C");
                        c = sc.nextDouble();
                        if (a+b>c && b+c>a && c+a>b){
                            newTrojuhelnik.setObsah(a, b, c);
                        }
                        else{
                            System.out.println("Neplatný trojúhelník!");
                        }
                        break;
                case 4: kruh newKruh = new kruh();
                        seznam.add(newKruh);
                        System.out.println("Zadej poloměr:");
                        a = sc.nextDouble();
                        newKruh.setObsah(a, 0, 0);
                        break;
                case 5: for (Tvar i: seznam) {
                            soucet += i.getObsah();
                        }
                        System.out.println(soucet);
                        break;
                case 6: seznam.sort((x, y) -> x.getObsah() > y.getObsah() ? -1 : x.getObsah() == y.getObsah() ? 0 : 1);
                        for (Tvar i: seznam) {
                            System.out.print(i.getName());
                            System.out.println(i.getObsah());
                        }

            }
            }

        }

    private static void menu(){
        System.out.println("MENU");
        System.out.println("=========");
        System.out.println("1 - pridej ctverec");
        System.out.println("2 - pridej obdelnik");
        System.out.println("3 - pridej trojuhelnik");
        System.out.println("4 - pridej kruh");
        System.out.println(" ");
        System.out.println("5 - Vypis soucet obsahu");
        System.out.println("6 - Vypis seznam objektu dle obsahu");
        System.out.println("0 - KONEC");
    }

}
