package atividade36;

import java.util.Scanner;

public class Atividade36 {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.print("Quantas horas de Atividade no mes? ");
        float hora = t.nextFloat();
        if (hora <= 10) {
            float pontos = (hora * 2);
            double  faturamento = (pontos * 0.05);
            System.out.printf("Seu Faturamento foi %.2f", faturamento);
        } else if (hora > 10 && hora <= 20) {
            float pontos = (hora * 5);
            double  faturamento = (pontos * 0.05);
            System.out.printf("Seu Faturamento foi %.2f", faturamento);
        } else {
            float pontos = (hora * 10);
            double  faturamento = (pontos * 0.05);
            System.out.printf("Seu Faturamento foi %.2f", faturamento);
        }
    }
    
}
