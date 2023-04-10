/* 5) O custo de um carro novo ao consumidor é a soma do custo de fábrica coma porcentagem do distribuidor e dos impostos (aplicados ao custo de fábrica). 
Supondo que o percentual do distribuidor seja de 28% e os impostos de 45%, escrever um algoritmo para ler o custo de fábrica de um carro, calcular e escrever o custo final ao consumidor. */

package Resumao;

import java.util.Scanner;

public class Questao05 {
    public static void main(String[] args){
        double custoCarroConsumidor = 0;
        double percentualDistribuidor = 0.28;
        double percentualImpostos = 0.45;
        double custoFabricaCarro = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe o custo de fábrica do carro: ");
        custoFabricaCarro = scan.nextDouble();

        custoCarroConsumidor = (custoFabricaCarro*percentualDistribuidor) + (custoFabricaCarro*percentualImpostos) + custoFabricaCarro;

        System.out.printf("Custo de fábrica do carro: %.2f \n", custoFabricaCarro);
        System.out.printf("Valor do distribuidor: %.2f \n", custoFabricaCarro*percentualDistribuidor);
        System.out.printf("Valor impostos: %.2f \n",custoFabricaCarro*percentualImpostos);
        System.out.printf("O valor final ao consumidor é de: %.2f \n", custoCarroConsumidor);


    }
}