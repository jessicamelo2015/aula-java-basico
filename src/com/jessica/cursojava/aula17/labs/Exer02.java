package com.jessica.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer02 {

	public static void main(String[] args) {
		Scanner scan=new Scanner (System.in);
		
		boolean senhaValida=false;
		
		do {
			System.out.println("digite seu nome");
			String nome= scan.next();
		
			System.out.println("digite sua senha");
			String senha= scan.next();
		
			if(nome.equalsIgnoreCase(senha)) {
			//senhaValida=false;
			System.out.println("senha invalida, nao pode ser igual ao nome");
			}else {
				senhaValida=true;
			System.out.println("senha correta, seja bem vindo");
			}
		}while(!senhaValida);
	}

}
