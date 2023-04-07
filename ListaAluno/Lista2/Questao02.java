package Lista2;

import java.util.Scanner;

/* 2) Ler 10 valores e escrever quantos desses valores lidos são NEGATIVOS e quantos são POSITIVOS.  */

public class Questao02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = 1;
        int numero = 0;

        do {
            System.out.println("\n" + i + " Informe um número: ");
            numero = scan.nextInt();

            if (numero == 0) {
                System.out.println("O número é zero");
            } else {

                System.out.println((numero > 0) ? "Número positivo" : "Número negativo");
            }
            i++;
        } while (i <= 10);
    }
}
