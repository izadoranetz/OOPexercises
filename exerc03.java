/* Ler um valor e escrever se é positivo ou negativo (considere o valor zero como
positivo). */

import java.util.Scanner;


public class exerc03
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o valor: ");
		int valor = scan.nextInt();
	
		if (valor < 0 ) {
		    System.out.println("Valor negativo");
		} else {
		    System.out.println("Valor positivo");
		}
		
	}
}