package atividade23;

import java.util.Scanner;

public class Atividade23 {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.print("Digite o seu nome: ");
        String nome = t.nextLine();
        System.out.print("Qual o seu Sexo: [M/F] ");
        String sexo = t.nextLine();
        System.out.print("Digite o valor da sua Compra: R$ ");
        float valor = t.nextFloat();
        if ("M".equals(sexo)) {
            double desch = valor*0.05;
            double pagamentoh = valor-desch;
            System.out.println("O valor que o senhor "+nome+" tem que pagar e "+pagamentoh);
        } else {
            double descf = valor*0.13;
            double pagamentof = valor-descf;
            System.out.println("O valor que a senhoara "+nome+" tem que pagar e "+pagamentof);
        }
    }
}
