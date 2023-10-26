package atividade20;

import java.util.Scanner;

public class Atividade20 {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.print("Digite um numero inteiro: ");
        int n = t.nextInt();
        if (n % 2 == 0) {
            System.out.println(n+" e PAR");
        } else {
            System.out.println(n+" e IMPAR");
        }
    }  
}
