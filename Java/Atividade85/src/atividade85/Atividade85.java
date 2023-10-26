package atividade85;

import java.util.Scanner;

public class Atividade85 {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        String nome[] = new String[4];
        String sexo[] = new String[4];
        float salario[] = new float[4];
        
        for (int c = 0; c < 4; c++) {
            System.out.println((c + 1) +". Pessoa.");
            System.out.print("Digite o seu Nome: ");
            nome[c] = t.next();
            System.out.print("Qual o seu Sexo? [M/F]: ");
            sexo[c] = t.next();
            System.out.print("Qual o seu Salario: R$ ");
            salario[c] = t.nextFloat();
            t.nextLine();
            System.out.println("");
        }
        System.out.println("Aqui estao as Funcionarias Mulheres que ganham mais de R$ 5000,00");
        for (int c = 0; c < 4; c++) {
            if (sexo[c].equals("F") && salario[c] > 5000) {
                System.out.println("Nome: "+ nome[c] +" Salario: R$ "+ salario[c]);
            }
        }
    } 
}
