package com.jessica.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer04 {

	public static void main(String[] args) {
		Scanner scan =new Scanner (System.in);
		System.out.println("insira a primeira nota: ");
		double nota1 =scan.nextDouble();
		System.out.println("insira a segunda nota: ");
		double nota2 = scan.nextDouble();
		System.out.println("insira a terceira nota: ");
		double nota3=scan.nextDouble();
		System.out.println("insira a quarta nota: ");
		double nota4=scan.nextDouble();
		
		double soma= (nota1 + nota2 + nota3 + nota4)/4;
		
		System.out.println("A médiaq é: "+soma);
				
	}

}
