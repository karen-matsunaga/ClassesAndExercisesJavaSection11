package curso_java;
import java.util.Locale;
import java.util.Scanner;

// EXERCÍCIO ERRADO NA CONDIÇÃO - 23/9/24

public class Glicose {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner s = new Scanner(System.in);

		double glicose;
		System.out.print("Digite a medida da glicose: ");
		glicose = s.nextDouble();
		// MINHA RESPOSTA
//		if (glicose <= 90.0) {
//			System.out.println("Classificacao: normal");
//		}
		// RESPOSTA
		if (glicose <= 100.0) {
			System.out.println("Classificacao: normal");
		}
		else if (glicose <= 140.0) {
			System.out.println("Classificacao: elevado");
		}
		else {
			System.out.println("Classificacao: diabetes");
		}
		s.close();
	}
}
