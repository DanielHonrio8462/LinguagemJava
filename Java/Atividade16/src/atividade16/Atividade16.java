package atividade16;

import java.util.Scanner;

public class Atividade16 {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.print("Digite a quantidade de cigarros fumados por dia: ");
        int cigarro = t.nextInt();
        System.out.print("Quantos anos voce ja fumou: ");
        int ano = t.nextInt();
        float tempopordia = cigarro*10;
        float tempoporano = tempopordia*(ano*365);
        System.out.println("Voce ja perdeu "+ tempoporano +" minutos de vida."); 
    }   
}
