package  br.com.dio.calculadora ;

import  java.util.Scanner ;

public  class  Calculadora {

	public  static  void  main ( String [] args ) {
		Varredura do scanner =  novo  scanner ( sistema . In);
		
		int a, b;
		
		Sistema . para fora . println ( " Digite o primeiro valor: " );
		a = scan . nextInt ();
		Sistema . para fora . println ( " Digite o segundo valor: " );
		b = digitalizar . nextInt ();
		
		int soma = soma (a, b);
		int subtracao = subtracao (a, b);
		int multiplicacao = multiplicacao (a, b);
		int divisao = divisao (a, b);
		
		Sistema . para fora . println ( " soma "  + soma);
		Sistema . para fora . println ( " sub "  + subtração);
		Sistema . para fora . println ( " mult "  + multiplicação);
		Sistema . para fora . println ( " div "  + divisao);
		
	}
	
	public  static  int  soma ( int  a , int  b ) {
		retornar a + b;
	}
	
	public  static  int  subtracao ( int  a , int  b ) {
		retornar a - b;
	}
	
	public  static  int  divisao ( int  a , int  b ) {
		return a / b;
	}
	
	public  static  int  multiplicacao ( int  a , int  b ) {
		return a * b;
	}
	

}
