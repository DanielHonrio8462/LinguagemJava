package atividade66;

import java.util.Scanner;

public class Atividade66 {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.print("Digite um valor: ");
        int n = t.nextInt();
        for (int cc = 1; cc <= 10; cc++) {
            System.out.println(n +" x "+ cc +" = "+ cc * n);
        }
    } 
}
