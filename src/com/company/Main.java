package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        System.out.println("Punkt meni(1-10):");
        int i = 0;
        do {
            i = getInt();
            switch(i) {
             case 1:

                System.out.println("Punkt meni---" + i);
                break;
             case 0:
                System.out.println("Game over");
                break;
             default:
                System.out.println("Od 1 do 10!");}
        }
        while (i != 0);
    }
    public static int getInt() {
        return new Scanner(System.in).nextInt();
    }
}
