package atividade42;

import java.util.Scanner;

public class Atividade42 {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.print("Digite um numero inteiro e positivo: ");
        int n = t.nextInt();
        int cc = 0;
        System.out.print("Contagem: ");
        while (cc <= n) {
            System.out.print(cc +" ");
            cc++;
        }
        System.out.print("Acabou!");
    }
    
}
