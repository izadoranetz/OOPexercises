package Resumao;

import java.util.Scanner;

/* 3) Escreva um algoritmo que permita fazer a conversão cambial entre reais e dólares. Considere como
taxa de cambio US$ 1,00 = R$ 4,05. Leia uma valor em reais pelo teclado e mostre o correspondente
em dólares. */

public class Questao03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Conversão cambinal");
        System.out.println("Informe o valor em reais: ");
        double valor = scan.nextDouble();

        double conversao = valor / 4.05;

        System.out.println("R$ " + valor + " é equivalente a US$ " + conversao );

    }
}