package curso_java;
import java.util.Locale;
import java.util.Scanner;

// EXERCÍCIO CORRETO - 23/9/24

public class Operadora {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner s = new Scanner(System.in);

		int min;
		double total;

		System.out.print("Digite a quantidade de minutos: ");
		min = s.nextInt();

		if (min < 100) {
			total = 50.00;
			System.out.println("Valor a pagar: R$ " + String.format("%.2f", total));
		}
		else {
			total = 50.00 + (min - 100) * 2.0;
			System.out.println("Valor a pagar: R$ " + String.format("%.2f", total));
		}
		s.close();
	}
}