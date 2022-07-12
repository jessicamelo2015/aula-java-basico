package com.jessica.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		
		boolean infoValida= false;
		String nome,sexo,estadoCivil;
		int idade;
		double salario;
		
		do {
			System.out.println("entre com nome");
			
			nome= scan.next();
			
			if(nome.length()>=3) {
				infoValida =true;
			}else {
				System.out.println("Nome precisa de no minimo 3 caracteres");
			}
		
		}while(!infoValida);
		
		infoValida=false;
			do {
				System.out.println("Entre com a idade: ");
				idade=scan.nextInt();
			
				if(idade>=0 && idade <=150) {
				infoValida=true;
				}else {
				System.out.println("Idade precisa ser entre 0 e 150!");
				}
				}while(!infoValida);
			
		infoValida= false;
		do {
			System.out.println("Entre com o salario: ");
			salario= scan.nextDouble();
			
			if(salario>=0 ) {
				infoValida =true;
			}else {
				System.out.println("salario precisa ser maior que 0.");
			}
		}while(!infoValida);
		infoValida=false;
		do {
			System.out.println("Entre com seu genero: ");
			sexo=scan.next();
			if(sexo.equalsIgnoreCase("f")||
					sexo.equalsIgnoreCase("m")) {
				infoValida=true;
			}else {
				System.out.println("sexo precisa ser 'f' ou 'm'");
;			}
		}while(!infoValida);
		
		infoValida=false;
		do {
			System.out.println("entre com o estado civil: ");
			estadoCivil=scan.next();
			if(estadoCivil.equalsIgnoreCase("solteiro")||
					estadoCivil.equalsIgnoreCase("casado")||
					estadoCivil.equalsIgnoreCase("viuvo")||
					estadoCivil.equalsIgnoreCase("divorciado")) {
				infoValida=true;
			}else {
				System.out.println("Estado civil precisa ser 'solteiro' ,'casado','viuvo','divorciado'");
			}
		}while(!infoValida);
		
		System.out.println("As seguintes informaçoes foram coletadas: ");
		System.out.println("Nome: "+nome);
		System.out.println("idade: "+idade);
		System.out.println("salario: "+salario);
		System.out.println("genero: "+sexo);
		System.out.println("Estado civil: "+estadoCivil);
	}

}
