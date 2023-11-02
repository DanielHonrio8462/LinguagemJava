package atividade46;

public class Atividade46 {

    public static void main(String[] args) {
        int cc = 6;
        int soma = 0;
        while (cc <= 100) {
            System.out.print(cc +" + ");
            soma += cc;
            cc += 2;
        }
        System.out.println(" = ");
        System.out.println("A soma desses numeros e "+ soma);
    }
    
}
