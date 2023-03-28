package Resumao;

import java.util.Scanner;

/* 1) Faça uma algoritmo que calcule o perímetro do triângulo. O programa deve receber 3 números
inteiros como parâmetro e deve retornar o valor do perímetro. */

public class Questao01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Vamos calcular o perímetro do triângulo.");
        System.out.println("Informe o valor do primeiro lado: ");
        double lado01 = scan.nextDouble();
        System.out.println("Informe o valor do segundo lado: ");
        double lado02 = scan.nextDouble();
        System.out.println("Informe o valor do terceiro lado: ");
        double lado03 = scan.nextDouble();

        double perimetro = lado01 + lado02 + lado03;

        System.out.println("O perímetro do triângulo é: " + perimetro);
    }
}
