package atividade10;

import java.util.Scanner;

public class Atividade10 {

    public static void main(String[] args) {
    Scanner t = new Scanner(System.in);
    System.out.print("Qual a largura da sua parede: ");
    float largura = t.nextFloat();
    System.out.print("Qual a altura da sua parede: ");
    float altura = t.nextFloat();
    float area = altura*largura;
    float tinta = area/2;
    System.out.println("Sera necessario "+ tinta +" litros de tinta para pintar sua parede.");
    }
}
