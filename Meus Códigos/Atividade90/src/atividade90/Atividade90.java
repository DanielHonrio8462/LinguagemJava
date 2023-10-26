package atividade90;

import java.util.Scanner;

public class Atividade90 {
    static void somador(int a, int b) {
        int soma = (a + b);
        System.out.println("A soma entre "+ a +" e "+ b +" e "+ soma);
    }
    static void maior(int a, int b) {
        if (a > b) {
            System.out.println(a +" e Maior que "+ b);
        } else if (a < b) {
            System.out.println(b +" e Maior que "+ a);
        } else if (a == b) {
            System.out.println(a +" e "+ b +" sao iguais");
        }
    }

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int n1 = t.nextInt();
        System.out.print("Digite outro numero: ");
        int n2 = t.nextInt();
        somador(n1,n2);
        maior(n1, n2);
    }
    
}
