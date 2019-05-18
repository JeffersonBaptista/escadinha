package com.br.escadinha;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		
		
		int escada;
		int degraus = 0;
		int cont = 1;

		Scanner scan = new Scanner(System.in);

		while (cont == 1) {
			StringBuilder escadinha = new StringBuilder();
					
		
			System.out.println("escolha quantos degras a escada tera:");
			degraus = scan.nextInt();
			
			System.out.println("escolha o caracter:");
			String caracter = scan.next();
			

			for (escada = 0; escada < degraus; escada++) {

				System.out.println(escadinha.insert(escada, caracter));

			}
			
			

		System.out.println("Digite 1 para continuar ou 0 para sair");
		cont = scan.nextInt();
		
		escada = escada -1;
		}

	}

}
