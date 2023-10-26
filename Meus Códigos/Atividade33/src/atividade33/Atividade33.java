package atividade33;

import java.util.Scanner;

public class Atividade33 {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.print("Digite o valor da casa: R$ ");
        float valorcasa = t.nextFloat();
        System.out.print("Digite o seu Salario: R$ ");
        float sal = t.nextFloat();
        System.out.print("Em quantos anos voce vai pagar? ");
        int ano = t.nextInt();
        double pagamentomax = valorcasa / (ano * 12);
        double sal30 = sal * 0.3;
        if (pagamentomax > sal30) {
            System.out.println("Emprestimo Negado");
        } else {
            System.out.println("Emprestimo Aceito");
        }
    }
    
}
