package Lista2;

import java.util.Scanner;

/*5) Leia várias idades e calcule a média entre as idades (usar uma variável para idade). */

public class Questao05 {
    public static void main(String[] args) {
        boolean parar = false;
        int resposta = 0;
        int idade = 0;
        int quantidadeDeIdades = 0;
        double mediaIdades = 0;
        int somaIdades = 0;

        while (parar == false) {
            System.out.println("Informe uma idade: ");
            Scanner scan = new Scanner(System.in);
            idade = scan.nextInt();
            quantidadeDeIdades += 1;
            somaIdades += idade;

            System.out.println("\n Deseja informar mais uma idade?\n Digite 1 - Sim ou 2 - Não \n");
            resposta = scan.nextInt();
            switch(resposta) {
            case 1:
                parar = false;
                break;
            case 2:
                parar = true;
                break;
            default:
                System.out.println("Informe 1 para sim ou 2 para não.");
            }
        }

        mediaIdades = somaIdades / quantidadeDeIdades;

        System.out.println("A média de idades é: " + mediaIdades);
    }
}
