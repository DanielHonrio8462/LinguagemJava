package atividade37;

import java.util.Scanner;

public class Atividade37 {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.print("Digite o seu Salario atual: R$ ");
        float salatual = t.nextFloat();
        
        t.nextLine();
        
        System.out.print("Digite o seu Sexo: [M/F] ");
        String sexo = t.nextLine();
        
        System.out.print("A quanto anos voce trabalha na Empresa? ");
        float anos = t.nextFloat();
        
        if ("F".equals(sexo)) {
            if (anos < 15) {
                double aumentode = (salatual * 0.05);
                double novosal = (salatual + aumentode);
                System.out.printf("Seu novo Salario e %.2f", novosal);
            } else if (anos >= 15 && anos <= 20) {
                double aumentode = (salatual * 0.12);
                double novosal = (salatual + aumentode);
                System.out.printf("Seu novo Salario e %.2f", novosal);
            } else if (anos > 20) {
                double aumentode = (salatual * 0.23);
                double novosal = (salatual + aumentode);
                System.out.printf("Seu novo Salario e %.2f", novosal);
            }
        } else if ("M".equals(sexo)) {
            if (anos < 20) {
                double aumentode = (salatual * 0.03);
                double novosal = (salatual + aumentode);
                System.out.printf("Seu novo Salario e %.2f", novosal);
            } else if (anos >= 20 && anos <= 30) {
                double aumentode = (salatual * 0.13);
                double novosal = (salatual + aumentode);
                System.out.printf("Seu novo Salario e %.2f", novosal);
            } else if (anos > 30) {
                double aumentode = (salatual * 0.25);
                double novosal = (salatual + aumentode);
                System.out.printf("Seu novo Salario e %.2f", novosal);
            }
        }
    }
    
}
