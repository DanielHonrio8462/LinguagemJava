package atividade68;

import java.util.Scanner;

public class Atividade68 {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int qtdf = 0;
        float mediapesof = 0;
        float somapesof = 0;
        int qtdmp = 0;
        float maiorpesom = 0;
        for (int cc = 1; cc <= 4; cc++) {
            System.out.println("Pessoa "+ cc);
            System.out.print("Qual o seu Sexo? [F|M]: ");
            String sexo = t.next();
            System.out.print("Qual o seu Peso em kg? ");
            float peso = t.nextFloat();
            System.out.println(" ");
            if (sexo.equals("F")) {
                qtdf += 1;
                somapesof += peso;
                mediapesof = somapesof / qtdf; 
            } else if (peso > 100 && sexo.equals("M"))  {
                qtdmp += 1;
            }
            if (sexo.equals("M") && peso > maiorpesom) {
                maiorpesom = peso;
            }
        }
        System.out.println("A quantidade de Mulher cadastrade e "+ qtdf);
        System.out.println("A quantidade de Homem com mais de 100kg e "+ qtdmp);
        System.out.println("A media de peso das Mulheres e "+ mediapesof);
        System.out.println("O maior peso entre os Homens e "+ maiorpesom);
    }
    
}
