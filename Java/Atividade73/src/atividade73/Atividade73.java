package atividade73;

public class Atividade73 {

    public static void main(String[] args) {
        int vet[] = new int[10];
        int valorInicial = 9;
        int decremento = 1;
        
        for (int i = 0; i < 10; i++) {
            vet[i] = valorInicial;
            valorInicial -= decremento;
        }
        for (int valor: vet) {
            System.out.print(valor +" ");
        }
    }
    
}
