package curso_java;
import java.util.Locale;
import java.util.Scanner;

// EXERCÍCIO CORRETO - 23/9/24

public class Dardo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner s = new Scanner(System.in);

		double a, b, c, maior;
		System.out.println("Digite as tres distancias:");
		a = s.nextDouble();
		b = s.nextDouble();
		c = s.nextDouble();
		if (a > b && a > c) {
			maior = a;
		}
		else if (b > a && b > c) {
			maior = b;
		}
		else {
			maior = c;
		}
		System.out.println("MAIOR DISTANCIA = " + String.format("%.2f", maior));
		s.close();
	}
}
