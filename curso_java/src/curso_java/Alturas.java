package curso_java;
import java.util.Locale;
import java.util.Scanner;
// EXERCÍCIO CORRETO - 25/9/24
public class Alturas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner s = new Scanner(System.in);
		int N, i;
		double alt = 0, med = 0, cont = 0, por = 0;
		System.out.print("Quantas pessoas serao digitadas? ");
		N = s.nextInt();
		String[] nome = new String[N];
		int[] idade = new int[N];
		double[] altura = new double[N];
		for (i = 0; i < N; i++) {
			System.out.println("Dados da " + (i+1) + "a pessoa: ");
			System.out.print("Nome: ");
			s.nextLine();
			nome[i] = s.nextLine();
			System.out.print("Idade: ");
			idade[i] = s.nextInt();
			System.out.print("Altura: ");
			altura[i] = s.nextDouble();
		}
		for (i = 0; i < N; i++) {
			alt = alt + altura[i];
		}
		med = alt / N;
		System.out.printf("\nAltura media: %.2f\n", med);
		for (i = 0; i < N; i++) {
			if (idade[i] < 16) {
				cont++;
			}
		}
		por = cont * 100.0 / N;
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", por);
		for (i = 0; i < N; i++) {
			if (idade[i] < 16) {
				System.out.println(nome[i]);
			}
		}
		s.close();
	}
}
