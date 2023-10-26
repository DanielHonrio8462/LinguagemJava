package atividade76;

import java.util.Scanner;

public class Atividade76 {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int vet[] = new int[4];
         
        for (int c = 0; c < 4; c++) {
            System.out.print("Digite o valor do "+ (c + 1) +" vetor: ");
            vet[c] = t.nextInt();
        }
        for (int valor: vet) {
            System.out.print(valor +" ");
        }
    }
    
}
