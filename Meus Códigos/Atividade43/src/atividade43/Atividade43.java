package atividade43;

public class Atividade43 {
    public static void main(String[] args) {
        int cc = 30;
        while (cc >= 1) {
            if (cc % 4 == 0) {
                System.out.print("["+ cc +"] ");
            } else {
                System.out.print(cc +" ");
            }
            cc--;
        }
    }
    
}
