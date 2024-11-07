package curso_java;
import java.util.Locale;
import java.util.Scanner;

// EXERCÍCIO CORRETO - 23/9/24

public class Temperatura {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner s = new Scanner(System.in);

		char esc;
		double c, f;
		System.out.print("Voce vai digitar a temperatura em qual escala (C/F)? ");
		esc = s.next().charAt(0);

		if (esc == 'F') {
		   System.out.print("Digite a temperatura em Fahrenheit: ");
		   f = s.nextDouble();
		   f =  5.0 / 9.0 * (f - 32.0);
		   System.out.println("Temperatura equivalente em Celsius: " + String.format("%.2f", f));
		}
		else if (esc == 'C') {
		   System.out.print("Digite a temperatura em Celsius: ");
		   c = s.nextDouble();
		   c = (9.0 / 5.0 * c) + 32.0;
		   System.out.println("Temperatura equivalente em Fahrenheit: " + String.format("%.2f", c));
		}
		s.close();
	}
}
