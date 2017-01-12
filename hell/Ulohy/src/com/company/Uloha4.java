package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Uloha4 {

    private static ArrayList<List> answer = new ArrayList<>();
    private static void permutate(List<Integer> arr, int x){
        ArrayList newArr = new ArrayList<>(arr);
        for(int i = x; i < arr.size(); i++){
            java.util.Collections.swap(arr, i, x);
            permutate(arr, x+1);
            java.util.Collections.swap(arr, x, i);
        }
        if (x == arr.size() -1){
            System.out.println(newArr);
            answer.add(newArr);
        }
    }

    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<Integer>();
        System.out.println("Tento program vypíše permutace 1-n, kolik má být n?");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 0;
        while(x <= n){
            list.add(x);
            x += 1;
        }
        permutate(list, 0);
        System.out.println(answer);
        System.out.print("Existuje ");
        System.out.print(answer.size());
        System.out.print(" reseni");
    }
}
