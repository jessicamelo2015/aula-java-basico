package com.jessica.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {
		Scanner scan =new Scanner (System.in);
		System.out.println("entre com o primeiro numero: ");
		int num1 =scan.nextInt();
		
		System.out.println("entre com o segundo numero: ");
		int num2 =scan.nextInt();
		
		int soma = num1 + num2;
		System.out.println("A soma dos dois numeros é: " + soma );
	}

}
