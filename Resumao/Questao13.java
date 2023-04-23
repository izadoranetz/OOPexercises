package Resumao;

/*13) Ler o ano atual e o ano de nascimento de uma pessoa. 
Escrever uma mensagem que diga se ela poderá ou não votar este ano 
(não é necessário considerar o mês em que a pessoa nasceu).  */

import java.util.Scanner;

public class Questao13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe o ano atual: ");        
        int anoAtual = scan.nextInt();
        System.out.println("Informe o ano em que você nasceu: ");
        int anoNascimento = scan.nextInt();

        int idade = anoAtual - anoNascimento;

        if(idade >= 16) {
            System.out.println("Você tem " + idade + " anos e já pode votar neste ano.");
        } else if(idade < 16 && idade > 1) {
            System.out.println("Você tem apenas " + idade + " anos de idade e não pode votar neste ano.");
        } else {
            System.out.println(idade + " anos. Idade inválida.");
        }


        scan.close();
        
    }
}
