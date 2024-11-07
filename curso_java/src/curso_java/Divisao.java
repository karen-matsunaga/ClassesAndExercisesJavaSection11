package curso_java;
import java.util.Locale;
import java.util.Scanner;

// EXERCÍCIO CORRETO - 25/9/24

public class Divisao {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner s = new Scanner(System.in);
		int N, i, x, y;
		double d;
		System.out.print("Quantos casos voce vai digitar? ");
		N = s.nextInt();
		for (i = 0; i < N; i++) {
			System.out.print("Entre com o numerador: ");
			x = s.nextInt();
			System.out.print("Entre com o denominador: ");
			y = s.nextInt();
			if (y == 0) {
				System.out.println("DIVISAO IMPOSSIVEL");
			}
			else {
				d = (double) x / y;
				System.out.printf("DIVISAO = %.2f\n", d);
			}
		}
		s.close();
	}
}
