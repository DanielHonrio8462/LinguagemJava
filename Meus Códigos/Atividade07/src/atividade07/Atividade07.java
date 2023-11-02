package atividade07;

import java.util.Scanner;

public class Atividade07 {
    public static void main(String[] args) {
    Scanner t = new Scanner(System.in);
    System.out.print("Digite um numero: ");
    float n = t.nextFloat();
    float dobro = n*2;
    float terca = n/3;
    System.out.println("O dobro de "+ n +" e "+ dobro);
    System.out.println("A terca parte de "+ n +" e "+ terca);
    }
    
}
