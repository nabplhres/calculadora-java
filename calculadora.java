package br.com.dio.calculadora;

import java.util.Scanner;

public class calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
			int a,b;
		
			System.out.println("digite o primeiro valor");
			a = scan.nextInt();
			System.out.println("digite o segundo valor");
			b = scan.nextInt();
			
			int soma = soma(a,b);
			int subtracao = subtracao(a,b);
			int multiplicacao = multiplicacao(a,b);
			int divisao = divisao(a,b);
			
			System.out.println(soma);
			System.out.println(subtracao);
			System.out.println(divisao);
			System.out.println(multiplicacao);
	}
	
}
	
	public static int soma(int a, b) {
		return a+b;
	}
	public static int subtracao(int a, b) {
		return a-b;
	}
	public static int divisao(int a, b) {
		return a/b;
	}
	public static int multiplicacao(int a, b) {
		return a*b;
	}


