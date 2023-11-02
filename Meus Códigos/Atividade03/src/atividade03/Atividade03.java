/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade03;

import java.util.Scanner;

/**
 *
 * @author dh185
 */
public class Atividade03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner t = new Scanner(System.in);
        
        System.out.print("Qual o seu nome: ");
        String nome = t.nextLine();
        
        System.out.print("Qual o seu salario: ");
        float sal = t.nextFloat();
        
        System.out.println("Nome do Funcionario: " + nome);
        System.out.println("Salario: " + sal);
        System.out.println("O Funcionario " + nome + " tem um salario de R$" + sal + " em Julho.");
    }
    
}
