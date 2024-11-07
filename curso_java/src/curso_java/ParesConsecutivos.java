package curso_java;
import java.util.Scanner;

// EXERCÍCIO CORRETO - 25/9/24

public class ParesConsecutivos {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int x, soma;
		System.out.print("Digite um numero inteiro: ");
		x = s.nextInt();
		while (x != 0) {
			if (x % 2 != 0) {
				x++;
			}
			soma = 5 * x + 20;
			System.out.println("SOMA = " + soma);
			System.out.print("Digite um numero inteiro: ");
			x = s.nextInt();
		}
		s.close();
	}
}
