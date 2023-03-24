/* 1) Escreva uma algoritmo que receba uma hora no formato de três números inteiros que representam: 
horas, minutos e segundos. Sua função deve calcular e retornar a quantidade total de segundos. */

import java.util.Scanner;

public class Main
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

/** 2) Escreva um algoritmo que leia a idade de uma pessoa em anos e apresente uma mensagem identificando se é maior ou menor de 18 anos. */

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Qual a sua idade?");
		int idade = scan.nextInt();
		
		System.out.println((idade >= 18) ? "Você é maior de idade" : "Você é menor de idade");
		
	}
}

/** 3) Ler 3 valores (considere que não serão informados valores iguais) e escrever o maior deles. */

import java.util.Scanner;

public class Main
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

/** 4) Ler dois valores (considere que não serão lidos valores iguais) e escrevê-los em ordem crescente. */

import java.util.Scanner;

public class Main
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