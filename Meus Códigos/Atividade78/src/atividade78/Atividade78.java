package atividade78;

import java.util.Arrays;
import java.util.Scanner;

public class Atividade78 {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int vet[] = new int[5];
        
        for (int c = 0; c < 5; c++) {
            System.out.print("Digite o "+ (c + 1) +" numero: ");
            vet[c] = t.nextInt();
        }
        for (int valor: vet) {
            System.out.print(valor +" ");
        }
        System.out.println("");
        System.out.print("O valores multiplos de 10 estao na posicao: ");
        for (int i = 0; i < 5; i++) {
            if (vet[i] % 10 == 0) {
                System.out.print(i +", ");
            }
        }
        
    }
    
}
