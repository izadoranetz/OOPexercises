package Lista1;

/** 3) Ler 3 valores (considere que não serão informados valores iguais) e escrever o maior deles. */

import java.util.Scanner;

public class Questao03
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o valor 1: ");
		int valor01 = scan.nextInt();
		
		System.out.println("Informe o valor 2: ");
		int valor02 = scan.nextInt();
		
		System.out.println("Informe o valor 3: ");
		int valor03 = scan.nextInt();
		
		int maiorValor = 0;
		
		if (valor03 > valor01 && valor03 > valor02) {
		    maiorValor = valor03;
		} else if (valor02 > valor01 && valor02 > valor03) {
		    maiorValor = valor02;
		} else {
		    maiorValor = valor01;
		}
		
		System.out.println("O maior valor é: " + maiorValor);
		
	}
}