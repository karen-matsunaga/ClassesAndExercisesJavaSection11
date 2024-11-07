package curso_java;
import java.util.Locale;
import java.util.Scanner;

// EXERCÍCIO CORRETO - 25/9/24

public class ValidacaoNota {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner s = new Scanner(System.in);
		double n1, n2, med;
		System.out.print("Digite a primeira nota: ");
		n1 = s.nextDouble();
		while (n1 < 0 || n1 > 10) {
			System.out.print("Valor invalido! Tente novamente: ");
			n1 = s.nextDouble();
		}
		System.out.print("Digite a segunda nota: ");
		n2 = s.nextDouble();
		while (n2 < 0 || n2 > 10) {
			System.out.print("Valor invalido! Tente novamente: ");
			n2 = s.nextDouble();
		}
		med = (n1 + n2) / 2.0;
		System.out.println("MEDIA = " + String.format("%.2f", med));
		s.close();
	}
}
