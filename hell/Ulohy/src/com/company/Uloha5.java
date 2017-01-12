package com.company;

/**
 * Created by Ladislav Louka on 24.11.2016.
 */
public class Uloha5 {
    public static void main(String[] args){
        int[][] pole = new int[][] {{1,2,3},{4,5,6},{7,8,9}};
        int[][] newPole = new int[pole[0].length][pole.length];
        //Fill new Array
        for(int i=0; i<pole.length; i++){
            for(int y=0; y<pole[i].length; y++){
                    newPole[y][i] = pole[i][y];
            }
        }
        System.out.println("OLD");
        // Print old array
        for (int[] i : pole) {
            for (int y : i){
                System.out.print(y);
                System.out.print(", ");
            }
            System.out.println("");
        }
        //Print new array
        System.out.println("NEW");
        for (int[] x : newPole) {
            for (int z : x){
                System.out.print(z);
                System.out.print(", ");
            }
            System.out.println("");
        }
    }
}
