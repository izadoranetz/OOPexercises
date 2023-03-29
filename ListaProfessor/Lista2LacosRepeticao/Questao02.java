package ListaProfessor.Lista2LacosRepeticao;

/* 2) Escreva um algoritmo para imprimir os números de 1 (inclusive) a 10 (inclusive) em ordem
decrescente. */

public class Questao02 {
    public static void main(String[] args){
        int contador = 10;

        do {
            System.out.println("Contagem regreessiva..." + contador);
            contador--;
        } while (contador > 0);
    }
}
