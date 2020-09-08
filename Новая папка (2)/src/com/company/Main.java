package com.company;
 import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int cnt=0;
        System.out.println("Введите положительное число: ");
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();

        boolean b = true;
        for (int P = 2; P <= input; P++) {
            for (int i = 2; i < P; i++) {
                if (P % i == 0) {
                    b = false;
                    break;
                }
            }


            if (b) {System.out.println(P); cnt++; }
            else b = true;

        }

        System.out.println("Всего "+cnt);
    }



}