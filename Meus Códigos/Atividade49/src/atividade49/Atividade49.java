package atividade49;

import java.util.Scanner;

public class Atividade49 {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int cc = 1;
        int par = 0;
        int impar = 0;
        while (cc <= 6) {
            System.out.print(cc +". Digite um numero: ");
            int n = t.nextInt();
            if (n % 2 == 0) {
                par += 1;
            } else {
                impar += 1;
            }
            cc++;
        }
        System.out.println("A quantidade de numeros pares e "+ par);
        System.out.println("A quantidade de numeros impares e "+ impar);
    }
    
}
