package atividade57;

import java.util.Scanner;

public class Atividade57 {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        float somasalh = 0;
        float somasalm = 0;
        
        while (true) {
            System.out.print("Digite o seu salario: R$ ");
            float sal = t.nextFloat();
            
            System.out.print("Qual o seu Sexo: ");
            String sexo = t.next();
            
            if (sexo.equals("M")) {
                somasalh += sal;
            } else {
                somasalm += sal;
            }
            System.out.print("Quer continuar? [S/N] ");
            String resp = t.next();
            System.out.println(" ");
            if (resp.equals("N")) {
                break;
            }
        }
        System.out.println("Total de Salario pago para os Homens: R$ "+ somasalh);
        System.out.println("Total de Salario pago para as Mulheres: R$ "+ somasalm);
    }
    
}
