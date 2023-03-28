/* Faça um algoritmo que leia a idade de uma pessoa em anos, meses e dias e escreva
a idade dessa pessoa expressa apenas em dias. Considerar ano com 365 dias e mês com
30 dias. */

import java.util.Scanner;


public class exerc02
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite sua idade em anos: ");
		int idadeAnos = scan.nextInt();
		System.out.println("Digite sua idade em meses: ");
		int idadeMeses = scan.nextInt();
		System.out.println("Digite sua idade em dias: ");
		int idadeDias = scan.nextInt();
		
		int idadeTotal = (idadeAnos * 365) + (idadeMeses * 30)+ idadeDias;
		
		System.out.println("Sua idade total em dias é " + idadeTotal);
		
	}
}