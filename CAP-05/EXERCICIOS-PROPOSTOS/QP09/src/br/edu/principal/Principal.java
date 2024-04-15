package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        int contador = 0;
		        int somaIdades = 0;
		        int pessoas_Psup90_Ainf150 = 0;
		        int pessoas_Ientre10e30_ASuperior190 = 0;

		        while (contador < 10) {
		            System.out.println("Informe a idade da pessoa " + (contador + 1) + ":");
		            int idade = sc.nextInt();
		            somaIdades =  somaIdades + idade;

		            System.out.println("Informe o peso da pessoa " + (contador + 1) + " (em kg):");
		            double peso = sc.nextDouble();

		            System.out.println("Informe a altura da pessoa " + (contador + 1) + " (em metros):");
		            double altura = sc.nextDouble();

		            if (peso > 90 && altura < 1.50) {
		            	pessoas_Psup90_Ainf150 = pessoas_Psup90_Ainf150 + 1;
		            }

		            if (idade >= 10 && idade <= 30 && altura > 1.90) {
		            	pessoas_Ientre10e30_ASuperior190 = pessoas_Ientre10e30_ASuperior190 + 1;
		            }

		            contador = contador + 1;
		        }

		        double mediaIdades = (double) somaIdades / contador;
		        double porc_Pessoas_Ientre10e30_ASuperior190 = (double) pessoas_Ientre10e30_ASuperior190 / contador * 100;

		        System.out.println("Média das idades: " + mediaIdades);
		        System.out.println("Quantidade de pessoas com peso superior a 90 kg e altura inferior a 1,50 m: " + pessoas_Psup90_Ainf150);
		        System.out.println("Porcentagem de pessoas com idade entre 10 e 30 anos entre as pessoas que medem mais de 1,90 m: " + porc_Pessoas_Ientre10e30_ASuperior190 + "%");
		    }
		


	}


