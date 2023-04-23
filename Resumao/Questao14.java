package Resumao;

/* 14) Ler dois valores (considere que não serão lidos valores iguais) e escrever o maior deles. */

import java.util.Scanner;

public class Questao14 {
    public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe um número: ");
		int numero1 = scan.nextInt();
		System.out.println("Informe um segundo número: ");
		int numero2 = scan.nextInt();
		
		if(numero1>numero2) {
			System.out.println("O maior número é " + numero1);
		} else {
			System.out.println("O maior número é " + numero2);
		}

	}

}
