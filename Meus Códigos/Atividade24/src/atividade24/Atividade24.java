package atividade24;

import java.util.Scanner;

public class Atividade24 {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.print("Qual a distancia que voce deseja percorrer em Km/h? ");
        float dist = t.nextFloat();
        if (dist <= 200) {
            double paga50 = dist*0.50;
            System.out.println("O valor e R$ "+paga50);
        } else {
            double paga45 = dist*0.45;
            System.out.println("O valor e R$ "+paga45);
        }
    }
    
}
