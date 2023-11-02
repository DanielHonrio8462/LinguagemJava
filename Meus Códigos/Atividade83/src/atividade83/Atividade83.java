package atividade83;

public class Atividade83 {

    public static void main(String[] args) {
        int vet[] = {5, 6, 8, 9, 4, 2, 1, 5, 6 ,22};
        int aux = 0;
        
        for (int valor: vet) {
            System.out.print(valor +" ");
        }
        for (int c = 0; c < 9; c++) {
            for (int i = (c + 1); i < 10; i++) {
                if (vet[c] > vet[i]) {
                    aux = vet[c];
                    vet[c] = vet[i];
                    vet[i] = aux;
                }
            }
        }
        System.out.println("O vetor em ordem crescente.");
        for (int c = 0; c < 10; c++) {
            System.out.print(vet[c] +" ");
        }
    }
    
}
