package ListaProfessor.Lista2LacosRepeticao;

/* 1) Escreva um algoritmo para imprimir os números de 1 (inclusive) a 10 (inclusive) em ordem
crescente. */

public class Questao01 {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        int contador = 0;

        while (contador < 10) {
            contador = contador + 1; // contador++
            System.out.println("Numero " + contador);
        }

    }
}
