package com.jessica.cursojava.aula16;

public class LoopFor {

	public static void main(String[] args) {
		
		for(int i=0; i<5; i++ ) {
			System.out.println("i tem valor: "+i);
		}
		for(int i=5; i>=0; i-- ) {
			System.out.println("i tem valor: "+i);
		}
		for(int i=0, j=10 ; i < j ;i++, j--) {
			System.out.println("i= "+i+ ";j =" + j);
		}
		int count=0;
		for(; count <5 ;) {
			System.out.println("valor de count: "+ count);
			count +=2;/// vai somar de 2 em 2
		}
		int soma=0;/// vai  somar a conta
		for (int i=1; i <5; soma += i++);
		System.out.println("O valor de soma é: "+soma);
	}
       	
}
