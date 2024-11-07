package curso_java;
import java.util.Scanner;

// EXERCÍCIO CORRETO - 22/9/24

public class Soma {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int x, y, soma;
		System.out.print("Digite o valor de X: ");
		x = s.nextInt();

		System.out.print("Digite o valor de Y: ");
		y = s.nextInt();

		soma = x + y;
		System.out.println("SOMA = " + soma);

        s.close();
	}
}
