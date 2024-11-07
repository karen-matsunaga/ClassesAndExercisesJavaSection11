package curso_java;
import java.util.Locale;
import java.util.Scanner;

// EXERCÍCIO CORRETO - 22/9/24

public class Retangulo {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner s = new Scanner(System.in);

		double base, alt, area, per, dia;

		System.out.print("Base do retangulo: ");
		base = s.nextDouble();

		System.out.print("Altura do retangulo: ");
		alt = s.nextDouble();

		area = base * alt;
		System.out.println("AREA = " + String.format("%.4f", area));

		per = 2 * (base + alt);
		System.out.println("PERIMETRO = " + String.format("%.4f", per));

		dia = Math.sqrt(Math.pow(base, 2.0) + Math.pow(alt, 2.0));
		System.out.println("DIAGONAL = " + String.format("%.4f", dia));

		s.close();
	}
}
