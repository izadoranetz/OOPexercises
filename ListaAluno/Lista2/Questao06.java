package Lista2;
import java.util.Scanner;
/* 6) Ler 10 números e imprimir quantos são pares e quantos são ímpares. */

public class Questao06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero;
        String pares = " ";
        String impares = " ";
        System.out.println("Digite 10 números:");

        for(int i = 0; i < 10; i++) {
            numero = scan.nextInt();
            if (numero % 2 == 0) {
                pares += numero + " ";
            } else {
                impares += numero + " ";
            }
        }

        System.out.println("Números pares: " + pares + " Números ímpares: " + impares);
        scan.close();

    }
}
