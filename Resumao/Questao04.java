/* 4) Escreva um algoritmo que leia a idade de uma pessoa em anos e apresente uma mensagem identificando se é maior ou menor de 18 anos. */

package Resumao;

import java.util.Scanner;

public class Questao04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Qual a sua idade?");

        int idade = scan.nextInt();

        if(idade >= 18) {
            System.out.println("Com " + idade + " anos você já é maior de idade");
        } else {
            System.out.println("Com " + idade + " anos você ainda é menor de idade");
        }

        scan.close();

            }
}