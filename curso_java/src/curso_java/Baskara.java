package curso_java;
import java.util.Locale;
import java.util.Scanner;

// EXERCÍCIO CORRETO - 23/9/24

public class Baskara {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner s = new Scanner(System.in);

		double a, b, c, d, x1, x2;
		System.out.print("Coeficiente a: ");
		a = s.nextDouble();
		System.out.print("Coeficiente b: ");
		b = s.nextDouble();
		System.out.print("Coeficiente c: ");
		c = s.nextDouble();

		d = Math.pow(b, 2.0) - (4 * a * c);

		if (a == 0 || d < 0) {
			System.out.println("Esta equacao nao possui raizes reais");
		}
		else {
		   x1 = (-b + Math.sqrt(d)) / (2.0 * a);
		   x2 = (-b - Math.sqrt(d)) / (2.0 * a);
		   System.out.println("X1 = " + String.format("%.4f", x1));
		   System.out.println("X2 = " + String.format("%.4f", x2));
		}
		s.close();
	}
}
