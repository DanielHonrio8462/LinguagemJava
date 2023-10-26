package atividade22;

import java.util.Scanner;

public class Atividade22 {
 
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.print("Digite o ano de seu Nascimento: ");
        int ano = t.nextInt();
        int idade = 2023 - ano;
        if (idade < 18) {
            int faltano = 18 - idade;
            System.out.println("Faltam "+faltano+" anos para voce se alistar.");
        } else {
            int passano = idade - 18;
            System.out.println("Ja se passaram "+passano+" anos do alistamento.");
        }
    }   
}
