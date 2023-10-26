package atividade18;

import java.util.Scanner;

public class Atividade18 {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.print("Qual o seu ano de nascimneto? ");
        int ano = t.nextInt();
        int idade = 2023-ano;
        if (idade >= 18) {
            System.out.println("Voce ja e maior de idade, tem que votar.");
        } else {
            System.out.println("Voce e menor de idade, nao pode votar.");
        }
    }
}
