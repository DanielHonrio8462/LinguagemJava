package atividade67;

import java.util.Scanner;

public class Atividade67 {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.print("Digite um numero inteiro: ");
        int n = t.nextInt();
        for (int cc = 0; cc <= n; cc++) {
            System.out.print(cc +" ");
        }
        System.out.println("FIM!");
    }
    
}
