/* 7) Escreva um algoritmo para ler uma temperatura em graus Fahrenheit, calcular e escrever o valor
correspondente em graus Celsius (baseado na fórmula abaixo):
*Observação:* Para testar se a sua resposta está correta saiba que 100oC = 212F */

package Resumao;

import java.util.Scanner;

public class Questao007 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe a temperatura em Fahrenheit: ");
        double temperaturaFahrenheit = scan.nextDouble();

        double temperaturaCelsius = (temperaturaFahrenheit-32)/1.8;

        System.out.println("Temperatura em Celsius: " + temperaturaCelsius);

        scan.close();
    }
}
