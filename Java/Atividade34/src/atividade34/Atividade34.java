package atividade34;

import java.util.Scanner;

public class Atividade34 {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.print("Digite o seu Peso em Kg: ");
        float peso = t.nextFloat();
        System.out.print("Digite a sua Altura: ");
        float altura = t.nextFloat();
        double imc = peso / Math.pow(altura, 2);
        System.out.printf("O seu imc e %.2f %n", imc);
        if (imc < 18.5) {
            System.out.println("Abixo do Peso");
        } else if (imc >= 18.5 && imc < 25) {
            System.out.println("Peso Ideal");
        } else if (imc >= 25 && imc < 30) {
            System.out.println("Sobrepeso");
        } else if (imc >= 30 && imc < 40) {
            System.out.println("Obesidade");
        } else if (imc >= 40) {
            System.out.println("Obesidade Morbida");
        }
    }
    
}
