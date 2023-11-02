package atividade17;

import java.util.Scanner;

public class Atividade17 {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.print("Digite a velocidade do seu carro em Km/h: ");
        float velo = t.nextFloat();
        if (velo > 80) {
            System.out.println("Voce foi multado");
            float taxa = velo-80;
            float mult = taxa*5;
            System.out.println("A sua multa foi no valor de "+ mult);
        } 
    }  
}
