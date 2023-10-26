package atividade87;

import java.util.Scanner;

public class Atividade87 {
    
    static void gerador(String termo, int qtd) {
        for (int c = 0; c < qtd; c++) {
             System.out.println("     "+ termo);
        }
    }
    static void escolhaBorda(int bord) {
        if (bord == 1) {
            System.out.println("+-------=======------+");
        } else if (bord == 2) {
            System.out.println("~~~~~~~~:::::::~~~~~~~");
        } else if (bord == 3) {
            System.out.println("<<<<<<<<------->>>>>>>");
        }
    }

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.println("Borda 1 = +-------=======------+");
        System.out.println("Borda 2 = ~~~~~~~~:::::::~~~~~~~");
        System.out.println("Borda 3 = <<<<<<<<------->>>>>>>");
        System.out.print("Qual borda voce quer? [1/2/3]: ");
        int borda = t.nextInt();
        System.out.println("");
        
        escolhaBorda(borda);
        gerador("Apredendo Java", 4);
        escolhaBorda(borda);
    }
    
}
