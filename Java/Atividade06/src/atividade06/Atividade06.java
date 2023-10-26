
package atividade06;

import java.util.Scanner;

public class Atividade06 {

    public static void main(String[] args) {
    Scanner t = new Scanner(System.in);
    System.out.print("Digite um numero inteiro: ");
    int n1 = t.nextInt();
    System.out.println("O antecessor de "+ n1 +" e "+ (n1-1));
    System.out.println("O sucessor de "+ n1 +" e "+ (n1+1));
    }
}
