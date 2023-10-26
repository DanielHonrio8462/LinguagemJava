package atividade21;

import java.util.Scanner;

public class Atividade21 {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.print("Digite um ano: ");
        int ano = t.nextInt();
        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
            System.out.println("O ano de "+ano+" E um ano Bissexto.");
        } else {
            System.out.println("O ano de "+ano+" Nao e um ano Bissexto.");
        }
    }
    
}
