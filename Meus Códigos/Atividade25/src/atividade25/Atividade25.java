package atividade25;

import java.util.Scanner;

public class Atividade25 {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.print("Digite o tamanho do primeiro segmento: ");
        float t1 = t.nextFloat();
        System.out.print("Digite o tamanho do segundo segmento: ");
        float t2 = t.nextFloat();
        System.out.print("Digite o tamanho do terceiro segmento: ");
        float t3 = t.nextFloat();
        if (t1 + t2 > t3 && t2 + t3 > t1 && t1 + t3 > t2) {
            System.out.println("Esses segmentos podem formar um triangulo.");
        } else {
            System.out.println("Esses segmentos nao podem formar um triangulo.");
        } 
    }
    
}
