package atividade27;

import java.util.Scanner;

public class Atividade27 {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.print("Digite a 1° nota: ");
        float n1 = t.nextFloat();
        System.out.print("Digite a 2° nota: ");
        float n2 = t.nextFloat();
        double m = (n1 + n2) / 2;
        System.out.println("Sua media e "+m);
        if (m < 5) {
            System.out.println("REPROVADO");
        } else if (m >= 5 && m < 7) {
            System.out.println("RECUPERACAO");
        } else {
            System.out.println("APROVADO");
        }
    }
    
}
