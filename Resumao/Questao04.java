/* 4) Escreva um algoritmo que leia a idade de uma pessoa em anos e apresente uma mensagem identificando se é maior ou menor de 18 anos. */

package Resumao;

import java.util.Scanner;

public class Questao04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int idade = scan.nextInt();

        if(idade >= 18 ) {
            System.out.printl("Com " + idade + " você já é maior de idade");
        } else (idade < 18 ) {
            System.out.println("Com " + idade + " você é menor de idade")
        }

        scan.close();

            }
}