package atividade44;

import java.util.Scanner;

public class Atividade44 {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.print("Digite o primeiro valor: ");
        int valorpri = t.nextInt();
        System.out.print("Digite o ultimo valor: ");
        int valorult = t.nextInt();
        System.out.print("Digite o incremento: ");
        int incre = t.nextInt();
        System.out.print("Contagem: ");
        
        int cc = valorpri;
        if (cc < valorult) {
            while (cc <= valorult) {
            System.out.print(cc +" ");
            cc += incre;
            }
        } else {
            while (cc >= valorult) {
                System.out.print(cc +" ");
                cc -= incre;
            }
        }
    }
}
