package Lista2;

import java.util.Scanner;

/* 3) Construa um programa que solicite uma frase escrita pelo usuário. 
Peça ao usuário para escolher uma palavra da frase escrita e retornar um índice referente à posição da palavra. 
(Utilize o método indexOf()). */

public class Questao03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Escreva uma frase: ");
        
        String frase = scan.nextLine();

        System.out.println("Escolha uma palavra da frase: ");

        String palavra = scan.nextLine();

        int indice = frase.indexOf(palavra);

        System.out.println("A palavra escolhida " + palavra + " está no índice " + indice + " da frase.");

    }
}
