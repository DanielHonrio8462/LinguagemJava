package atividade98;

import java.util.Scanner;

public class Atividade98 {
    static int superSomador(int a, int b) {
        int soma = 0;
        if (a < b) {
            for (int c = a; c <= b; c++) {
                soma += c;
            }
        } else {
            for (int c = b; c <= a; c++) {
                soma += c;
            }
        }
        return soma;
    }

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int n1 = t.nextInt();
        System.out.print("Digite outro numero: ");
        int n2 = t.nextInt();
        
        System.out.println("");
        int resp = superSomador(n1, n2);
        System.out.println("A soma dos numeros no intervalo dos numeros digitados e "+ resp);
    }
    
}
