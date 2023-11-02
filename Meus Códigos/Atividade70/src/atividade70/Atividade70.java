package atividade70;

public class Atividade70 {

    public static void main(String[] args) {
        int t1 = 1;
        System.out.print(t1);
        int t2 = 1;
        int t3;
        System.out.print(", "+ t2 +", ");
        for (int cc = 0; cc <= 7; cc++) {
            t3 = t1 + t2;
            System.out.print(t3 +", ");
            t1 = t2;
            t2 = t3;
        }
    }
    
}
