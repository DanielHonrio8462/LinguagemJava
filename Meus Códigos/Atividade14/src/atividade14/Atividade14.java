package atividade14;

import java.util.Scanner;

public class Atividade14 {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.print("Digite a quantidade de Km percorrido pelo seu carro: ");
        double km = t.nextDouble();
        System.out.print("Digite a quantidade de dias que ficou com o carro: ");
        int dias = t.nextInt();
        double pagapordia = dias*90;
        double pagaporkm = km*0.2;
        double pagamentotot = pagapordia+pagaporkm;
        System.out.println("Voce tera que pagar R$"+ pagamentotot);
    }  
}
