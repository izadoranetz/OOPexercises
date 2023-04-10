/** Escreva um algoritmo que permita fazer a conversão cambial entre reais e dólares. Considere como
 taxa de cambio US$ 1,00 = R$ 4,05. Leia uma valor em reais pelo teclado e mostre o correspondente
 em dólares. */

 import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        double valorReais = 0;
        double valorDolares = 0;
        double taxaCambioRealDolar = 4.05;

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o valor em reais: ");
        valorReais = scan.nextDouble();

        valorDolares = valorReais / taxaCambioRealDolar;

        System.out.print("Valor em dolares: " + valorDolares);

    }
}
