package com.jessica.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer01 {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		
			boolean notaValida =false;
			
		do {
			System.out.println("Entre com a nota");
			double nota = scan.nextDouble();
		
			if( nota>=0 && nota <=10) {
				notaValida=true;
			   System.out.println("Voce digitou:" +nota);
			}else {
				//notaValida=false;
			   System.out.println("Nota invalida, digite novamente");
			}
		}  while(!notaValida);
			
			
			
	}

}
