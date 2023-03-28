package Lista1;

/** 2) Escreva um algoritmo que leia a idade de uma pessoa em anos e apresente uma mensagem identificando se é maior ou menor de 18 anos. */

import java.util.Scanner;

public class Questao02
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Qual a sua idade?");
		int idade = scan.nextInt();
		
		System.out.println((idade >= 18) ? "Você é maior de idade" : "Você é menor de idade");
		
	}
}