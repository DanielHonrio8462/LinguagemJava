package atividade92;

import java.util.Scanner;

public class Atividade92 {
    static void parImpar(int a) {
        if (a % 2 == 0) {
            System.out.println("Esse numero e Par.");
        } else if (a % 2 != 0) {
            System.out.println("Esse numero e Imapar");
        }    
    }

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int n = t.nextInt();
        
        parImpar(n);
    }
    
}
