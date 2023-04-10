/** Escreva uma algoritmo que receba uma hora no formato de três números inteiros que representam:
 horas, minutos e segundos. Sua função deve calcular e retornar a quantidade total de segundos. */

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a hora: ");
        int hora = scan.nextInt();

        System.out.println("Digite os minutos: ");
        int minuto = scan.nextInt();

        System.out.println("Digite os segundos: ");
        int segundo = scan.nextInt();

        int totalSegundos = (hora * 3600) + (minuto * 60) + segundo;
        System.out.println("O total de segundos é: " + totalSegundos);
    }
}
