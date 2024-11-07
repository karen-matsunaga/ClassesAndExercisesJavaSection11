package curso_java;
import java.util.Locale;
import java.util.Scanner;

// EXERCÍCIO CORRETO - 22/9/24

public class Circulo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner s = new Scanner(System.in);

		double r, area;
		System.out.print("Digite o valor do raio do circulo: ");
		r = s.nextDouble();

		area = Math.PI * Math.pow(r, 2.0);
		System.out.println("AREA = " + String.format("%.3f", area));
		s.close();
	}
}
