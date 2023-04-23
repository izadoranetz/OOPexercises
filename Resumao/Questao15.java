package Resumao;

/* 15) Ler dois valores (considere que não serão lidos valores iguais)  e escrevê-los em ordem crescente.
 */

import java.util.Scanner;

public class Questao15 {
    public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe um número: ");
		int numero1 = scan.nextInt();
		System.out.println("Informe um segundo número: ");
		int numero2 = scan.nextInt();

        if(numero1>numero2) {
			System.out.println(numero2 + " - " + numero1);
		} else {
			System.out.println(numero1 + " - " + numero2);
		}

    }
}
