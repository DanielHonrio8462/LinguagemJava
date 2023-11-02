package atividade94;

import java.util.Scanner;

public class Atividade94 {
    static void fibonacci(int a) {
        int t1 = 1; 
        System.out.print(t1 +" ");
        int t2 = 1;
        System.out.print(t2 +" ");
        for (int c = 2; c < a; c++) {
            int t3 = t1 + t2;
            System.out.print(t3 +" ");
            t1 = t2;
            t2 = t3;
        }
        
    }

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.print("Quantos termo da sequencia fibonacci voce quer? ");
        int qtdfibo = t.nextInt();
        
        System.out.println("");
        fibonacci(qtdfibo);
    }
    
}
