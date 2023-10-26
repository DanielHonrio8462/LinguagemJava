package atividade79;

import java.util.Scanner;

public class Atividade79 {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int vet[] = new int[5];
        
        for (int c = 0; c < 5; c++) {
            System.out.print("Digite o "+ (c + 1) +" numero: ");
            vet[c] = t.nextInt();
        }
        System.out.println("");
        System.out.print("Esses sao os numeros pares digitados: ");
        for (int c = 0; c < 5; c++) {
            if (vet[c] % 2 == 0) {
                System.out.print(vet[c] +", ");
            }
        }
        System.out.println("");
        System.out.print("Essas sao suas posicoes: ");
        for (int c = 0; c < 5; c++) {
            if (vet[c] % 2 == 0) {
                System.out.print(c +", ");
            }
        }
    }
    
}
