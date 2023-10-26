package atividade15;

import java.util.Scanner;

public class Atividade15 {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.print("Digite a quantidade de dias trabalhados no mes: ");
        int dias = t.nextInt();
        float pagadodia = 8*25;
        float pagatot = dias* pagadodia;
        System.out.println("O salario atual desse funcionario é "+ pagatot);
    }
}
