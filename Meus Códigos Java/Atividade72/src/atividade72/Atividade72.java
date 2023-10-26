package atividade72;

public class Atividade72 {

    public static void main(String[] args) {   
        int vet[] = new int[10];
        int valorInicial = 0;
        int incremento = 5;
        
        for (int c = 0; c < 10; c++) {
            vet[c] = valorInicial;
            valorInicial += incremento;
        }
        for (int valor: vet) {
            System.out.print(valor +" ");
        }
    }
}
