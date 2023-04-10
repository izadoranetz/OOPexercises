/* Faça uma algoritmo que calcule o perímetro do triângulo. O programa deve receber 3 números
inteiros como parâmetro e deve retornar o valor do perímetro. */

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o valor do primeiro lado: ");
        int lado1 = scan.nextInt();

        System.out.println("Digite o valor do segundo lado: ");
        int lado2 = scan.nextInt();

        System.out.println("Digite o valor do terceiro lado: ");
        int lado3 = scan.nextInt();
        
        int perimetro = lado1 + lado2 + lado3;
        System.out.println("O perímetro do triângulo é: " + perimetro);
    }
}
