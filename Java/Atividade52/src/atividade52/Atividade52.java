package atividade52;

import java.util.Scanner;

public class Atividade52 {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int cc = 1;
        int soma = 0;
        int maioridade = 0;
        int qtdmaior18 = 0;
        int qtdmenor5 = 0;
        float media = 0;
        while (cc <= 4) {
            System.out.print("Pessoa "+ cc +" Digite a sua idade: ");
            int idade = t.nextInt();
            if (idade >= 18) {
                qtdmaior18 += 1;
            } else if (idade < 5) {
                qtdmenor5 += 1;
            }
            if (idade > maioridade) {
                maioridade = idade;
            }
            soma += idade;
            media = soma / 4;
            cc++;
        }
        System.out.println("A media das idade e = "+ media);
        System.out.println("A quantidade de pessoas maior de 18 anos e = "+ qtdmaior18);
        System.out.println("A quantidade de pessoas menor de 5 anos e = "+ qtdmenor5);
        System.out.println("A maior idade desse grupo de pessoas e = "+ maioridade);
    }
    
}
