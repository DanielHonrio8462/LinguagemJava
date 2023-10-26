package atividade63;

import java.util.Scanner;

public class Atividade63 {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        String resp;
        int cc = 0;
        float n;
        float somatorio = 0;
        float menor = 999999;
        int qtd = 0;
        float media = 0;
        int par = 0;
        do {
            cc++;
            System.out.print(cc +". Digite um numero: ");
            n = t.nextFloat();
            qtd += 1;
            
            if (n < menor) {
                menor = n;
            }
            somatorio += n;
            media = somatorio / qtd;
            if (n % 2 == 0) {
                par += 1;
            }
            System.out.print("Quer continuar? [S/N] ");
            resp = t.next();
        } while (resp.equals("S"));
        System.out.println("O Somatorio dos numeros e "+ somatorio);
        System.out.println("O menor valor digitado e "+ menor);
        System.out.println("A media dos numeros digitados e "+ media);
        System.out.println("A quantidade de numeros pares e "+ par);
    }
    
}
