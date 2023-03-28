import java.util.Scanner;

public class exerc01
{
	public static void main(String[] args) {
		System.out.println("Digite o valor: ");
		Scanner scan = new Scanner(System.in);
		int valor = scan.nextInt();
    
		System.out.println("O dobro de " + valor + " é " + valor * 2 + ".");
		
	}
}
