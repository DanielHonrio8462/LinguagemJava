package atividade09;

import java.util.Scanner;

public class Atividade09 {
    public static void main(String[] args) {
    Scanner t = new Scanner(System.in);
        System.out.print("Digite quanto dinheiro em reais tem na sua carteira: R$ ");
        double di = t.nextDouble();
        double cambio = 3.45;
        double dollar = di/cambio;
        System.out.println("Com esse dinheiro voce consegue comprar U$$ "+ dollar);
    }
    
}
