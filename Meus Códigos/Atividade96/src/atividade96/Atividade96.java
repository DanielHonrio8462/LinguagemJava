package atividade96;

import java.util.Scanner;

public class Atividade96 {
    static float media(float a, float b) {
        float resultado = (a + b)/ 2;
        return resultado;
    }
    static String situacao(float medi) {
        String s; 
        if (medi >= 7) {
            s = "APROVADO";
        } else if (medi < 7 && medi >= 5) {
            s = "RECUPERACAO";
        } else {
            s = "REPROVADO";
        }
        return s;
    }

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.print("Qual sua primeira nota? ");
        float n1 = t.nextFloat();
        System.out.print("Qual sua segunda nota? ");
        float n2 = t.nextFloat();
        
        System.out.println("");
        float resp = media(n1, n2);
        System.out.println("A media das notas e "+ resp);
        String situ = situacao(resp);
        System.out.println("Aluno "+ situ);
    }   
}
