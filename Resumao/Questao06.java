/* 6) Uma revendedora de carros usados paga a seus funcionários vendedores um salário fixo por

mês, mais uma comissão também fixa para cada carro vendido e mais 5% do valor das vendas por ele

efetuadas. Escrever um algoritmo que leia o número de carros por ele vendidos, o valor total de suas

vendas, o salário fixo e o valor que ele recebe por carro vendido. Calcule e escreva o salário final do

vendedor. */

package Resumao;

import java.util.Scanner;

public class Questao06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Calculadora salário dos vendedores \n ------------------------ \n");
        System.out.println("Informe o número de carros vendidos: ");
        int qtdCarrosVendidos = scan.nextInt();
        System.out.println("Informe o valor total de vendas:");
        double valorTotalVendas = scan.nextDouble();
        System.out.println("Informe o salário fixo em R$");
        double salarioFixo = scan.nextDouble();
        System.out.println("Informe o valor da comissão fixa por carro, em R$ ");
        double comissaoFixa = scan.nextDouble();

        double salarioFinal = (qtdCarrosVendidos * comissaoFixa) + (valorTotalVendas*0.05) + salarioFixo;

        System.out.println("\nSalário fixo: R$ " + salarioFixo);
        System.out.println("Total valor em vendas: R$ " + valorTotalVendas);
        System.out.println("Total Vendas com bônus de 5%: R$ " + valorTotalVendas*0.05);
        System.out.println("Número de carros vendidos: " + qtdCarrosVendidos);
        System.out.println("Total comissão por carro vendido: R$ " + qtdCarrosVendidos * comissaoFixa);
        System.out.println("Salário final: R$ " + salarioFinal);
        
    }
}
