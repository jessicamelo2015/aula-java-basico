package com.jessica.cursojava.aula14;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		/*System.out.println("Entre com sua idade");
		int idade =scan.nextInt();

		if (idade>=18) {
			System.out.println("É maior de idade");
		}
		else {
			System.out.println("Não é maior de idade");
		}*/
		System.out.println("Entre com o preço do item");
		double valor =scan.nextDouble();
		
		if(valor <=10) {
			System.out.println("Esta barato, pode comprar");
			}
			else if(valor<10 && valor <15) {
				System.out.println("Quero desconto, por favor");
			}
			else if(valor>=15 && valor<17) {
				System.out.println("Pode pesquisar mais");
			}
			else {
				System.out.println("Esta muito caro");
			}
		
	}

}
