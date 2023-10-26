package atividade04;

import java.util.Scanner;

public class Atividade04 {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int n1 = t.nextInt();
        System.out.print("Digete outro numero: ");
        int n2 = t.nextInt();
        int res = n1 + n2;
        System.out.println("A soma entre "+ n1 +" e "+ n2 +" e igual a " + res);
    }
    
}
