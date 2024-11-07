package curso_java;
import java.util.Locale;
import java.util.Scanner;
// EXERCÍCIO CORRETO - 26/9/24
public class MediaPares {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner s = new Scanner(System.in);
		int N, i, cont = 0, soma = 0;
		double med;
		System.out.print("Quantos elementos vai ter o vetor? ");
		N = s.nextInt();
		int[] vet = new int[N];
		for (i = 0; i < N; i++) {
			System.out.print("Digite um numero: ");
			vet[i] = s.nextInt();
		}
		for (i = 0; i < N; i++) {
			if (vet[i] % 2 == 0) {
				soma = soma + vet[i];
				cont++;
			}
		}
		if (cont > 0) {
		   med = (double) soma / cont;
		   System.out.printf("MEDIA DOS PARES = %.1f\n", med);
		}
		else {
			System.out.println("NENHUM NUMERO PAR");
		}

		s.close();
	}
}
