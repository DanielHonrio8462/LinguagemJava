package atividade13;

import java.util.Scanner;

public class Atividade13 {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.print("Digite o seu Salario: R$ ");
        double sal = t.nextDouble();
        double aumento = sal*0.15;
        double salcomaumento = sal+aumento; 
        System.out.println("O novo salario e R$"+ salcomaumento);
    }
}
