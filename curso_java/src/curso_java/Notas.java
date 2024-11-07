package curso_java;
import java.util.Locale;
import java.util.Scanner;

// EXERCÍCIO CORRETO - 23/9/24

public class Notas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner s = new Scanner(System.in);

		double n1, n2, nf;
		System.out.print("Digite a primeira nota: ");
		n1 = s.nextDouble();
		System.out.print("Digite a segunda nota: ");
		n2 = s.nextDouble();
		nf = n1 + n2;
		System.out.println("NOTA FINAL = " + String.format("%.1f", nf));
		if (nf < 60.0) {
			System.out.println("REPROVADO");
		}
		s.close();
	}
}
