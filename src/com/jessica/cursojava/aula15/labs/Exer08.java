package com.jessica.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer08 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Entre com primeiro preço: ");
		double preco1 = scan.nextDouble();
		
		System.out.println("Entre com o segundo numero: ");
		double preco2 =scan.nextDouble();
		
		System.out.println("Entre com o terceiro numero: ");
		double preco3 =scan.nextDouble();
		 
		if(preco1<= preco2 && preco1<= preco3) {
			System.out.println("Compre o produto 1 ele esta baratoo");
		}else if(preco2<=preco1 && preco2 <=preco3) {
			System.out.println("Compre o produto 2 ele esta barato");
		}else if(preco3<= preco1 && preco3<=preco2) {
			System.out.println("Compre o produto 3 ele esta barato");
		}
	}

}
