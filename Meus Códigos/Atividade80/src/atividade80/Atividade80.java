package atividade80;

import java.util.Scanner;

public class Atividade80 {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int vet[] = new int[5];
        int qtdchave = 0;
        
        for (int c = 0; c < 5; c++) {
            System.out.print("Digite o "+ (c + 1) +" numero: ");
            vet[c] = t.nextInt();
        }
        for (int valor: vet) {
            System.out.print(valor +" ");
        }
        System.out.println("");
        System.out.print("Digite um numero entre 1 a 15: ");
        int n = t.nextInt();
        System.out.print("Esse numero apareceu na posicao: ");
        for (int c = 0; c < 5; c++) {
            if (vet[c] == n) {
                qtdchave += 1;
                System.out.print(c +" ");
            }
        }
        System.out.println("");
        System.out.println("A quantidade de vezes que ele apareceu foi "+ qtdchave);
    }
    
}
