package Resumao;


/* 8) Faça um algoritmo que leia três notas de um aluno, calcule e escreva a média final deste aluno. 
Considerar que a média é ponderada e que o peso das notas é 2, 3 e 5. Fórmula para o cálculo da média final é:

                n1 * 2 + n2 * 3 + n3 * 5 
mediafinal = ---------------------------------
                           10

*/

import java.util.Scanner;
public class Questao08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Calculadora de média ponderada. \n Informe a primeira nota: ");
        double nota1 = scan.nextDouble();
        System.out.println("Informe a segunda nota: ");
        double nota2 = scan.nextDouble();
        System.out.println("Informe o valor da terceira nota: ");
        double nota3 = scan.nextDouble();

        double media = (nota1 * 2 + nota2 * 3 + nota3 * 5 ) / 10;

        System.out.println("A média final é: " + media);
    }
}
