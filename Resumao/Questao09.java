
/* 9) Ler um valor e escrever a mensagem É MAIOR QUE 10! se o valor lido for maior que 10, caso contrário escrever NÃO É MAIOR QUE 10!  */
package Resumao;

import java.util.Scanner;

public class Questao09 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe um valor numérico: ");
        int valor = scan.nextInt();

        if(valor > 10) {
            System.out.println("É MAIOR QUE 10!");
        } else {
            System.out.println("NÃO É MAIOR QUE 10!");
        }

        scan.close();
    }
    
}
