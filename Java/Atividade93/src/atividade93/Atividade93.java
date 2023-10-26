package atividade93;

import java.util.Scanner;

public class Atividade93 {
    static void contador(int a, int b, int x) {
        for (int c = a; c <= b; c += x) {
            System.out.print(c +" ");
        }
    }

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.print("Qual o inicio do contador? ");
        int inicioContador = t.nextInt();
        System.out.print("Qual o fim do contador? ");
        int fimContador = t.nextInt();
        System.out.print("Qual o incremeto do contador? ");
        int incremento = t.nextInt();
        
        System.out.println("");
        contador(inicioContador, fimContador, incremento);
    }
    
}
