package atividade82;

import java.util.Scanner;

public class Atividade82 {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        float vet[] = new float[4];
        float somatorioNota = 0;
        float media = 0;
        int qtdAlunoAcimaDaMedia = 0;
        float maiorNota = 0;
        
        for (int c = 0; c < 4; c++) {
            System.out.print((c + 1) +". Digite sua nota: ");
            vet[c] = t.nextFloat();
            somatorioNota += vet[c];
            media = somatorioNota / (c + 1);
            if (vet[c] > maiorNota) {
                maiorNota = vet[c];
            }
        }
        for (int c = 0; c < 4; c++) {
            if (vet[c] > media) {
                qtdAlunoAcimaDaMedia += 1;
            }
        }
        System.out.println("A media das notas e "+ media);
        System.out.println("A quantidade de aluno acima da media e "+ qtdAlunoAcimaDaMedia);
        System.out.println("A Maior nota foi "+ maiorNota);
        System.out.print("A posicao da Maior nota e ");
        for (int c = 0; c < 4; c++) {
            if (vet[c] >= maiorNota) {
                System.out.print("["+ (c + 1) +"] ");
            }
        }
        System.out.println("");
    }
    
}
