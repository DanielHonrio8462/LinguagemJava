package atividade74;

public class Atividade74 {

    public static void main(String[] args) {
        int vet[] = new int[10];
        int valor1 = 5;
        int valor2 = 3; 
        
        for (int c = 0; c < 10; c++) {
            if (c % 2 == 0) {
                vet[c] = valor1;
            } else if (c % 2 != 0) {
                vet[c] = valor2;
            }
        }
        for (int valor: vet) {
            System.out.print(valor +" ");
        }
    }
    
}
