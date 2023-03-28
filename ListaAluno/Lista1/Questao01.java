package Lista1;

/* 1) Escreva uma algoritmo que receba uma hora no formato de três números inteiros que representam: 
horas, minutos e segundos. Sua função deve calcular e retornar a quantidade total de segundos. */

import java.util.Scanner;

public class Questao01 
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insira as horas: ");
		int horas = scan.nextInt();
		System.out.println("Insira os minutos: ");
		int minutos = scan.nextInt();
		System.out.println("Insira os segundos: ");
		int segundos = scan.nextInt();
		
		int horariosSegundos = segundos + (minutos*60) + (horas*3600);
		
		System.out.println("O horário em segundos é:" + horariosSegundos);
		
		
	}
}