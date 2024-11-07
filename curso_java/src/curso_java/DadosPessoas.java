package curso_java;
import java.util.Locale;
import java.util.Scanner;
// EXERCÍCIO CORRETO - 26/9/24
public class DadosPessoas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner s = new Scanner(System.in);
		int N, i, m = 0, h = 0;
		System.out.print("Quantas pessoas serao digitadas? ");
		N = s.nextInt();
		double[] alt = new double[N];
		char[] gen = new char[N];
		for (i = 0; i < N; i++) {
			System.out.print("Altura da " + (i+1) + "a pessoa: ");
			alt[i] = s.nextDouble();
			System.out.print("Genero da " + (i+1) + "a pessoa: ");
			gen[i] = s.next().charAt(0);
		}
		double menor = alt[0], maior = alt[0], med = 0, soma = 0;
		for (i = 0; i < N; i++) {
			if (alt[i] < menor) {
				menor = alt[i];
			}
			else if (alt[i] > maior) {
				maior = alt[i];
			}
		}
		System.out.printf("Menor altura = %.2f\n", menor);
		System.out.printf("Maior altura = %.2f\n", maior);
		for (i = 0; i < N; i++) {
			if (gen[i] == 'F') {
				m++;
				soma = soma + alt[i];
			}
		}
		med = (double) soma / m;
		System.out.printf("Media das alturas das mulheres = %.2f\n", med);
		h = N - m;
		System.out.printf("Numero de homens = %d\n", h);
		s.close();
	}
}
