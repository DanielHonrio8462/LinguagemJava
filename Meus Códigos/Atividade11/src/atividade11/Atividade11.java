package atividade11;

import java.util.Scanner;

public class Atividade11 {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.print("Digite o valor de A: ");
        double A = t.nextDouble();
        System.out.print("Digire o valor de B: ");
        double  B = t.nextDouble();
        System.out.print("Digite o valor de C: ");
        double C = t.nextDouble();
        double delta = Math.pow(B, 2)-4*A*C;
        System.out.println("O valor de Delta e "+ delta);   
    }    
}
