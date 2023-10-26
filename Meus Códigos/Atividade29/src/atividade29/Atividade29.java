package atividade29;

import java.util.Scanner;

public class Atividade29 {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.print("Digite o seu nome: ");
        String nome = t.nextLine();
        System.out.print("Digite o seu Salario: R$ ");
        float sal = t.nextFloat();
        System.out.print("Quantos anos trabalha na Empresa: ");
        int ano = t.nextInt();
        if (ano <= 3) {
            double aumento = (sal * 0.03); 
            double novosal = aumento + sal;
            System.out.println("O novo Salario de "+ nome +" e "+ novosal);
        } else if (ano > 3 && ano < 10) {
            double aumento = (sal * 0.125); 
            double novosal = aumento + sal;
            System.out.println("O novo Salario de "+ nome +" e "+ novosal);
        } else {
            double aumento = (sal * 0.2); 
            double novosal = aumento + sal;
            System.out.println("O novo Salario de "+ nome +" e "+ novosal);
        }
    }
    
}
