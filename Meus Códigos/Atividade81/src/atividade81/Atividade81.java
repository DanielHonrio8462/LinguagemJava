package atividade81;

import java.util.Scanner;

public class Atividade81 {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int vet[] = new int[4];
        int somatorioIdade = 0;
        float media = 0;
        int maiorIdade = 0; 
        
        for (int c = 0; c < 4; c++) {
            System.out.print((c + 1) +". Digite sua idade: ");
            vet[c] = t.nextInt();
            somatorioIdade += vet[c]; 
            media = somatorioIdade / (c + 1);
            if (vet[c] > maiorIdade) {
                maiorIdade += vet[c];
            }
        }
        System.out.println("");
        System.out.println("A media da idade das pessoas cadastradas e "+ media);
        System.out.print("Essas sao as posicoes com pessoa com mais de 25 anos de idade: ");
        for (int c = 0; c < 4; c++) {
            if ( vet[c] > 25) {
                System.out.print((c + 1) +", ");
            }
        }
        System.out.println("");
        System.out.println("A maior idade digita e "+ maiorIdade);
        System.out.print("A posicao da maior idade cadastrada e ");
        for (int c = 0; c < 4; c++) {
            if (vet[c] >= maiorIdade) {
                System.out.print((c + 1) +", ");
            }
        }
    }
    
}
