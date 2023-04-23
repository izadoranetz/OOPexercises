package Resumao;
/* 12) Ler as notas da 1a e 2a avaliações de um aluno. 
Calcular a média aritmética simples e escrever uma mensagem que diga se o aluno foi ou não aprovado 
(considerar que nota igual ou maior que 6 o aluno é aprovado). 
Escrever também a media calculada.  */

import java.util.Scanner;

public class Questao12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe a nota da 1a avaliação:");
        double nota1 = scan.nextDouble();
        System.out.println("Informe a nota da 2a avaliação:");
        double nota2 = scan.nextDouble();

        double mediaAritm = (nota1 + nota2) / 2;

        if(mediaAritm >= 6) {
            System.out.printf("Sua média foi: %.2f. Você foi aprovado. Parabéns!", mediaAritm);
        } else {
            System.out.printf("Sua média foi: %.2f. Você não foi aprovado.", mediaAritm);
        }

        scan.close();
    }
}
