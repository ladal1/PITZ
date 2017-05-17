package com;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Ladislav Louka on 03.05.2017.
 */


public class Druhy {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            try {
                System.out.println("Zadej a:");
                Integer a = sc.nextInt();
                System.out.println("Zadej b:");
                Integer b = sc.nextInt();
                System.out.println("Zadej c:");
                Integer c = sc.nextInt();
                try {
                    if (jePravouhly(a, b, c)){
                        System.out.println("Troj�heln�k je pravo�hl�");
                    }
                    else{
                        System.out.println("Troj�heln�k nen� pravo�hl�");
                    }
                    break;
                }
                catch (com.NeplatnyTrojuhelnikException e){
                    System.out.println("Nejde o tro�heln�k");
                }

            } catch (InputMismatchException e) {
                System.out.println("Zadej ��sla, nevym��lej si blbosti");
            }
        }
    }
    private static boolean jePravouhly(int a, int b, int c) throws NeplatnyTrojuhelnikException{
        if (a<b+c && b<a+c && c<a+b) {
            return (Math.pow(a,2) + Math.pow(b,2) == Math.pow(c,2)) || (Math.pow(b,2) + Math.pow(c,2) == Math.pow(a,2)) || (Math.pow(a,2) + Math.pow(c,2) == Math.pow(b,2));
        }
        else{
            throw new NeplatnyTrojuhelnikException();
        }
    }
}
