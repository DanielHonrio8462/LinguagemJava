package atividade58;
import java.util.Scanner;
public class Atividade58 {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int qtdaluno = 0;
        int somaidade = 0;
        float mediaidade = 0;
        System.out.println("Quando digitar a idade 999 encerra o sistema.");
        
        while (true) {
            System.out.println("Aluno "+ qtdaluno);
            System.out.print("Qual a sua idade? ");
            int idade = t.nextInt();
            System.out.println(" ");
            if (idade == 999) {
                break;
            }
            qtdaluno += 1;
            somaidade += idade;
            mediaidade = idade/qtdaluno;
        }
        System.out.println("A quantidade de aluno e "+ qtdaluno);
        System.out.println("A soma das idade e "+ somaidade);
        System.out.println("A media das idade e "+ mediaidade);
    }
    
}
