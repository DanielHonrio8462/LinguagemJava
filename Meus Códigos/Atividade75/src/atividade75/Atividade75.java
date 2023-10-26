package atividade75;

public class Atividade75 {
    public static void main(String[] args) {
        int vet[] = new int[14];
        int termo1 = 1;
        System.out.print(termo1 +" ");
        int termo2 = 1; 
        System.out.print(termo2 +" ");
        int termo3 = 2;
         
        for (int c = 0; c < 14; c++) {
            vet[c] = termo3;
            termo1 = termo2;
            termo2 = termo3;
            termo3 = termo1 + termo2;
        }
        for (int valor: vet) {
            System.out.print(valor +" ");
        }
    
    }
    
}
