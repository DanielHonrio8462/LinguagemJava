package atividade26;

import java.util.Scanner;

public class Atividade26 {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int n1 = t.nextInt();
        System.out.print("Digite outro numero: ");
        int n2 = t.nextInt();
        if (n1 > n2) {
            System.out.println("O primeiro valor e o maior.");
        } else if (n2 > n1) {
            System.out.println("O segundo vlor e o maior.");
        } else {
            System.out.println("Nao existe valor maior, os dois sao iguais.");
        }
    }
    
}
