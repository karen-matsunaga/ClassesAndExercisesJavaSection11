package curso_java;
import java.util.Locale;
import java.util.Scanner;

// EXERCÍCIO CORRETO - 22/9/24

public class Idades {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner s = new Scanner(System.in);

		String nome1, nome2;
		int idade1, idade2;
		double media;

		System.out.println("Dados da primeira pessoa: ");
		System.out.print("Nome: ");
		nome1 = s.nextLine();
		System.out.print("Idade: ");
		idade1 = s.nextInt();

		System.out.println("Dados da segunda pessoa: ");
		System.out.print("Nome: ");
		s.nextLine();
		nome2 = s.nextLine();
		System.out.print("Idade: ");
		idade2 = s.nextInt();

		media = (double) (idade1 + idade2) / 2;

		System.out.println("A idade media de " + nome1
				+ " e " + nome2 + " e de " + String.format("%.1f", media) + " anos");

		s.close();
	}
}
