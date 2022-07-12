package com.jessica.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer05 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Entre com a primeira nota");
		double nota1=scan.nextDouble();
		
		System.out.println("Entre com a segunda nota");
		double nota2=scan.nextDouble();
		
		double notas=(nota1+nota2)/2;
		
		if(notas == 10) {
			System.out.println("Parabens voce tirou 10 APROVADISSIMO");
		}else if(notas >=7) {
			System.out.println("Parabens voce esta APROVADO");
		}else {
			System.out.println("InFELIZmente voce vai ter que pagar mais uma mensalidade,nao foi dessa vez que voce se livrou de nós! REPROVADO!  :)");
		}
		
	}

}
