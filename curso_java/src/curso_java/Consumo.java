package curso_java;
import java.util.Locale;
import java.util.Scanner;

// EXERCÍCIO CORRETO - 22/9/24

public class Consumo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner s = new Scanner(System.in);

		int d;
		double c, con;
		System.out.print("Distancia percorrida: ");
		d = s.nextInt();
		System.out.print("Combustivel gasto: ");
		c = s.nextDouble();

		con = d / c;
		System.out.println("Consumo medio = " + String.format("%.3f", con));

		s.close();
	}
}
