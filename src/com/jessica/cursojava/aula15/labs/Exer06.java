package com.jessica.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Entre com o primeiro numero: ");
		int num1=scan.nextInt();
		
		System.out.println("Entre com o segundo numero: ");
		int num2=scan.nextInt();
		
		System.out.println("Entre com o terceiro numero:");
		int num3=scan.nextInt();
		
		if(num1>= num2 && num1 >=num3) {
			System.out.println("num1 é o numero maior: "+num1);
		}else if(num2>=num1 && num2 >=num3) {
			System.out.println("num2 é o numero maior: "+num2);
		}else {
			System.out.println("num3 é o maior numero "+num3);
		}
	}

}
