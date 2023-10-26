package atividade77;

import java.util.Scanner;

public class Atividade77 {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        String vet[] = new String[4];
        
        for (int c = 0; c < 4; c++) {
            System.out.print("Digite o "+ (c + 1) +" nome: ");
            vet[c] = t.next();
        }
        System.out.println("");
        for (int i = 3; i >= 0; i--) {
            System.out.print(vet[i] +" ");
        }
    }
    
}
