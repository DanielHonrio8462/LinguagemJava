package atividade48;

import java.util.Scanner;

public class Atividade48 {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int cc = 1;
        int soma = 0;
        while (cc <= 7) {
            System.out.print("Digite o "+ cc +"° numero: ");
            int n = t.nextInt();
            soma += n;
            cc++;
        }
        System.out.println("A soma entre esses numeros e = "+ soma);
    }
    
}
