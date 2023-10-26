package atividade12;

import java.util.Scanner;

public class Atividade12 {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.print("Digite o preco do preduto: R$ ");
        double preco = t.nextDouble();
        double desconto = preco*0.03;
        double promo = preco-desconto;
        System.out.println("O valor do produto com desconto e "+ promo);
    }  
}
