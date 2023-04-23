package Resumao;
/* 10) Ler um valor e escrever se é positivo ou negativo (considere o valor zero como positivo). 
 */

import java.util.Scanner;

public class Questao10 {
    public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe um número: ");
		int numero = scan.nextInt();
		
		if(numero >= 0) {
			System.out.println("O número é positivo");
		} else {
			System.out.println("O número é negativo");
		}
	}

}
