package atividade19;

import java.util.Scanner;

public class Atividade19 {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.print("Digite o seu nome: ");
        String nome = t.nextLine();
        System.out.print("Ditete a sua 1° nota: ");
        float n1 = t.nextFloat();
        System.out.print("Digete a sua 2° nota: ");
        float n2 = t.nextFloat();
        float media = (n1 + n2)/2;
        System.out.println("A Media do aluno(a): "+nome+" foi: "+media);
        if (media >= 7) {
            System.out.println("Teve um bom aproveitamento.");
        } else {
            System.out.println("Nao teve um bom aproveitamento.");
        }
    }
    
}
