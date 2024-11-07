package curso_java;
import java.util.Locale;
import java.util.Scanner;

// EXERCÍCIO CORRETO - 22/9/24

public class Medidas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner s = new Scanner(System.in);

		double a, b, c, aQ, aT, aTr;
		System.out.print("Digite a medida A: ");
		a = s.nextDouble();
		System.out.print("Digite a medida B: ");
		b = s.nextDouble();
		System.out.print("Digite a medida C: ");
		c = s.nextDouble();

		aQ = Math.pow(a, 2.0);
		System.out.println("AREA DO QUADRADO = " + String.format("%.4f", aQ));
		aT = a * b / 2.0;
		System.out.println("AREA DO TRIANGULO = " + String.format("%.4f", aT));
		aTr = (a + b) * c / 2.0;
		System.out.println("AREA DO TRAPEZIO = " + String.format("%.4f", aTr));
		s.close();
	}
}
