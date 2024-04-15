package br.edu.principal;

import java.util.Scanner;
;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double preco, imp, transp, seguro, Final, total_imp = 0;
        int origem;
        String meio_t, carga;

        System.out.println("Digite o preço do produto:");
        preco = sc.nextDouble();

        while (preco > 0) {
            System.out.println("Digite a origem:");
            origem = sc.nextInt();

            System.out.println("Digite o meio de transporte:");
            meio_t = sc.next();

            System.out.println("O produto é carga perigosa? (S ou N):");
            carga = sc.next();

            if (preco <= 100) {
                imp = preco * 5/100; 
            } else {
                imp = preco * 10/100; 
            }

            if (carga.equals("S")) {
                if (origem == 2) {
                    transp = 50;
                } else if (origem == 3) {
                    transp = 24;
                } else {
                    transp = 0; 
                }
            } else { 
                if (origem == 2) {
                    transp = 12;
                } else if (origem == 3) {
                    transp = 60;
                } else {
                    transp = 0; 
                }
            }

            if (origem == 2 || meio_t.equals("A")) {
                seguro = preco / 2; 
            } else {
                seguro = 0; 

            Final = preco + imp + transp + seguro;
            total_imp = total_imp + imp;

            System.out.println("Imposto: " + imp);
            System.out.println("Transporte: " + transp);
            System.out.println("Seguro: " + seguro);
            System.out.println("Preço final: " + Final);

            System.out.println("digite o preço do proximo produto: ");
            preco = sc.nextDouble();
        }

        System.out.println("Total de impostos: " + total_imp);

    }
    }
}
