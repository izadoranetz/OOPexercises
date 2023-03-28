package Lista1;

/** 4) Ler dois valores (considere que não serão lidos valores iguais) e escrevê-los em ordem crescente. */

import java.util.Scanner;

public class Questao04
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int valor01 = 0;
		int valor02 = 0;
		
		do {
		    
		    System.out.println("Informe dois valores diferentes");
		    System.out.println("Informe o valor 1: ");
		    valor01 = scan.nextInt();
		
		    System.out.println("Informe o valor 2: ");
		    valor02 = scan.nextInt();
		    
		} while (valor01 == valor02);
		
		System.out.println((valor01 > valor02) ? valor02 + " e " + valor01 : valor01 + " e " + valor02);
		
	}
}