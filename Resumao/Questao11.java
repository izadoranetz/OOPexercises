package Resumao;
/*11) As maçãs custam R$ 1,30 cada se forem compradas menos de uma dúzia, e R$ 1,00 se forem compradas pelo menos 12. 
Escreva um programa que leia o número de maçãs compradas, calcule e escreva o custo total da compra.  */

import java.util.Scanner;

public class Questao11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe o número de maçãs que você deseja comprar: ");
        int numMacas = scan.nextInt();
        double precoUnit = 0;
        double custoTotal;

        if(numMacas >= 12 ) {
            precoUnit = 1.0;
        } else if(numMacas < 12 && numMacas > 0) {
            precoUnit = 1.3;
        } else {
            System.out.println("Número informado é inválido. Informe um número de unidades maior que zero.");
        }

        custoTotal = precoUnit * numMacas;

        System.out.println("Resumo da compra: " + numMacas + " maçãs.\nPreço unitário: R$ " + precoUnit);
        System.out.printf("Total: R$ %.2f", custoTotal);

    }

}
