package atividade99;

import java.util.Scanner;

public class Atividade99 {
    static double potencia(float a, float b) {
        double g = Math.pow(a, b);
        return g;
    }

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.print("Digite a base da potencia: ");
        float n1 = t.nextFloat();
        System.out.print("Digite o expoente da potencia: ");
        float n2 = t.nextFloat();
        
        System.out.println("");
        double resp = potencia(n1, n2);
        System.out.println("O resultado e "+ resp);
    }
    
}
