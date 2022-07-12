package com.jessica.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Entre com um letra:(F ou M )");
				
		
		String sexo = scan.next();
		
		if(sexo.equalsIgnoreCase("f")) {
			System.out.println("F- feminino");
		}else if(sexo.equalsIgnoreCase("m")) {
			System.out.println("M -masculino");
		}
		else {
			System.out.println("Sexo invalido");
		}
		 

	}

}
