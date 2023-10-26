package atividade56;

import java.util.Scanner;

public class Atividade56 {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int somatorio = 0;
        int numero;
        
        System.out.println("Digite numeros para somar. Digite 1111 para encerrar.");
        while (true) {
            System.out.print("Digite um numero: ");
            numero = t.nextInt();

            if (numero == 1111) {
                break;
            }
            somatorio += numero;
        }

        System.out.println("O somatorio dos numeros digitados e: " + somatorio);
    }
    
}
