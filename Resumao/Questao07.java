package Resumao;

/* 7) Escreva um algoritmo para ler uma temperatura em graus Fahrenheit, calcular e escrever o valor correspondente em graus Celsius
 (baseado na fórmula abaixo):
Observação: Para testar se a sua resposta está correta saiba que 100oC = 212F */

import java.util.Scanner;

public class Questao07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe a temperatura em graus Fahrenheit: ");
		double fahrenheit = scan.nextDouble();
		double celsius = ( 5* (fahrenheit-32) / 9 );
		System.out.println("A temperatura " + fahrenheit + " em Celsius é de " + celsius + " ºC");

	}

}

