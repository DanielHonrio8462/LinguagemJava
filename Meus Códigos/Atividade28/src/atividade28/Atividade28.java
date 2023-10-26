package atividade28;

import java.util.Scanner;

public class Atividade28 {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.print("Digite a Largura do terreno em metros: ");
        float lar = t.nextFloat();
        System.out.print("Digite o comprimento do terreno em metros: ");
        float com = t.nextFloat();
        double area = (com * lar);
        System.out.println("A area desse terreno e "+ area);
        if (area < 100) {
            System.out.println("TERRENO POPULAR");
        } else if (area >= 100 && area <= 500) {
            System.out.println("TERRENO MASTER");
        } else {
            System.out.println("TERRENO VIP");
        }
    }
    
}
