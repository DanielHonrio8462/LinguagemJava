package atividade35;

import java.util.Scanner;

public class Atividade35 {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.print("Digite o tipo de Carro: [P/L] ");
        String tipocarro = t.nextLine();
        System.out.print("Quantos dias de aluguel: ");
        int dias = t.nextInt();
        System.out.print("Quanto Km foram percorridos? ");
        float km = t.nextFloat();
        if ("P".equals(tipocarro)) {
            if (km <= 100) {
                double pagamentotot = (90 * dias) + (km * 0.2);
                System.out.printf("Valor do Pagamento: R$ %.2f", pagamentotot);
            } else if (km > 100) {
                double pagamentotot = (90 * dias) + (km * 0.1);
                System.out.printf("Valor do Pagamento: R$ %.2f", pagamentotot);
            }
        } else if ("L".equals(tipocarro)) {
            if (km <= 200) {
                double pagamentotot = (150 * dias) + (km * 0.3);
                System.out.printf("Valor do Pagamento: R$ %.2f", pagamentotot);
            } else if ( km > 200) {
                double pagamentotot = (150 * dias) + (km * 0.25);
                System.out.printf("Valor do Pagamento: R$ %.2f", pagamentotot);
            }
        }
    }
    
}
