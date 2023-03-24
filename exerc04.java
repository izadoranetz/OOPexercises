/*4) Ler um valor e escrever maior, igual ou menor a zero.*/

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Insira um número: ");
		int numero = scan.nextInt();
		
		if(numero < 0 ){
		    System.out.println("Número menor que zero");
		} else if (numero > 0) {
		    System.out.println("Número maior que zero");
		} else {
		    System.out.println("Número igual a zero");
		}
	}
}