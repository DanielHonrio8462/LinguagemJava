package atividade69;

import java.util.Scanner;

public class Atividade69 {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.print("Digite o primeiro termo de uma PA: ");
        int termo1 = t.nextInt();
        System.out.print("Digite a razao da PA: ");
        int razao = t.nextInt();
        int proximotermo = 0;
        int somatorio = 0;
        
        System.out.print("PA (");
        for (int cc = 1; cc <= 9; cc++) {
            System.out.print(+ termo1 +", ");
            somatorio += termo1;
            proximotermo = termo1 + razao;
            termo1 = proximotermo;   
        }
        System.out.println(termo1 +")");
        System.out.println("O Somatorio dessa PA e "+ (somatorio + termo1));
    }
    
}
