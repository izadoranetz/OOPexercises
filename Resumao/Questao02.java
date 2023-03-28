package Resumao;

import java.util.Scanner;

/* 2) Escreva uma algoritmo que receba uma hora no formato de três números inteiros que representam:
horas, minutos e segundos. Sua função deve calcular e retornar a quantidade total de segundos. */

public class Questao02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Vamos calcular a quantidade de segundos.");
        System.out.println("Informe a hora: ");
        int hora = scan.nextInt();
        System.out.println("Informe os minutos: ");
        int minuto = scan.nextInt();
        System.out.println("Informe os segundos: ");
        int segundo = scan.nextInt();

        int totalSegundos = segundo + (minuto*60) + (hora*3600);
        System.out.println("Total segundos é: " + totalSegundos);

    }
}
