package atividade84;

import java.util.Scanner;

public class Atividade84 {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int idade[] = new int[4];
        String nome[] = new String[4]; 
        
        for (int c = 0; c < 4; c++) {
            System.out.println((c + 1) +". Pessoa");
            System.out.print("Digite o seu nome: ");
            nome[c] = t.next();
            System.out.print("Digite a sua idade: ");
            idade[c] = t.nextInt();
            System.out.println("");
        }
        System.out.println("Esses sao os dados das pessoas menores de 18 anos.");
        for (int c = 0; c < 4; c++) {
            if (idade[c] < 18) {
                System.out.println(nome[c] +" tem "+ idade[c] +" anos de idade.");
            }
        }
    }
    
}
