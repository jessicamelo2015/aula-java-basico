package com.jessica.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer07 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("digite o primeiro numero: ");
		int num1= scan.nextInt();
		
		System.out.println("digite o segundo numero: ");
		int num2= scan.nextInt();
		
		System.out.println("digite o terceiro numero: ");
		int num3= scan.nextInt();
		
		if(num1>num2 && num1>num3) {
			System.out.println("o primeiro numero que voce digiotu é maior: "+num1);
		}else if(num2>num1 && num2>num3) {
			System.out.println("O segundo numero que voce digitou é maior: "+num2);
		}else if (num3> num1 && num3>num2) {
			System.out.println("O terceiro numero que voce digitou é maior: "+num3);
		}
		
		if(num1<num2 && num1 <num3) {
			System.out.println("O primeiro numero que voce digitou é menor: "+num1);
		}else if(num2<num1 && num2<num3) {
			System.out.println("O segundo numero que voce digitou é menor: "+num2);
		}else if(num3<num1 && num3<num2) {
			System.out.println("O terceiro numero que voce digitou é menor: "+num3);
		}
		

	}

}
