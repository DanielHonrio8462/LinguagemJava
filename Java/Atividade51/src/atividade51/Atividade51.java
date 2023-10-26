package atividade51;

import java.util.Scanner;

public class Atividade51 {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int somatorio = 0;
        int numero = 0;

        System.out.println("Digite números para somar. Digite 1111 para encerrar.");

        while (numero != 1111) {
            System.out.print("Digite um número: ");
            numero = t.nextInt();

            somatorio += numero;
        }

        System.out.println("O somatório dos números digitados é: " + somatorio);
    }
    
}
