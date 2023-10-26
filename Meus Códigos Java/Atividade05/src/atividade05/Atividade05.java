
package atividade05;

import java.util.Scanner;

public class Atividade05 {

    public static void main(String[] args) {
    Scanner t = new Scanner(System.in);
        System.out.print("Digite a sua primeira nota: ");
        float n1 = t.nextFloat();
        System.out.print("Digite a sua segunda nota: ");
        float n2 = t.nextFloat();
        float m = (n1+n2)/2;
        System.out.println("A media entre "+ n1 +" e "+ n2+" e igual a "+ m);
    }
    
}
