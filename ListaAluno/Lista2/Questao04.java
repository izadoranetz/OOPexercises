package Lista2;
import java.util.Scanner;

/*4) Faça um programa que leia quatro palavras pelo teclado, e armazene cada palavra em uma string. 
Depois, concatene todas as strings lidas numa única string. Por fim apresente esta como resultado ao final do programa.  */

public class Questao04 {
    public static void main(String[] args) {
        int i = 0;
        Scanner scan = new Scanner(System.in);

        String palavra, palavras = "";

        do {
            System.out.println("Digite uma palavra: ");
            palavra = scan.nextLine();
            palavras += palavra + " ";
            i++;
        } while (i < 4);

        scan.close();
        System.out.println("As palavras digitadas foram: " + palavras);

    }
}
