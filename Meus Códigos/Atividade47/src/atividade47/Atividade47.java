package atividade47;

public class Atividade47 {

    public static void main(String[] args) {
        int cc = 500;
        int soma = 0;
        while (cc >= 0) {
            System.out.print(cc +" ");
            soma += cc;
            cc -= 50;
        }
        System.out.println(" ");
        System.out.println("A soma desses numeros e = "+ soma);
    }
    
}
