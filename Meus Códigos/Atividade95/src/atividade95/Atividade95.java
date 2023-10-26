package atividade95;

import java.util.Scanner;

public class Atividade95 {
    static int somador(int b, int a) {
        int s = (a + b);
        return s;
    }

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int n1 = t.nextInt();
        System.out.print("Digite outro numero: ");
        int n2 = t.nextInt();
        
        int res = somador(n1, n2);
        System.out.println("A soma entre os numeros e "+ res);
    }
    
}
