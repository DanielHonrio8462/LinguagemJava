package atividade97;

import java.util.Scanner;

public class Atividade97 {
    static int maior(int a, int b, int c) {
        if (a > b && a > c) {
            return a;
        } else if (b > a && b > c) {
            return b;
        } else {
            return c;
        }
    }
        
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.println("Digite tres valores: ");
        System.out.print("- ");
        int n1 = t.nextInt();
        System.out.print("- ");
        int n2 = t.nextInt();
        System.out.print("- ");
        int n3 = t.nextInt();
        
        System.out.println("");
        int resp = maior(n1, n2, n3);
        System.out.println("O valor maior e "+ resp);
    }
    
}
