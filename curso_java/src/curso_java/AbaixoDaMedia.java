package curso_java;
import java.util.Locale;
import java.util.Scanner;
// EXERCÍCIO CORRETO - 26/9/24
public class AbaixoDaMedia {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner s = new Scanner(System.in);
		int N, i;
		double soma = 0, med = 0;
		System.out.print("Quantos elementos vai ter o vetor? ");
		N = s.nextInt();
		double[] vet = new double[N];
		for (i = 0; i < N; i++) {
			System.out.print("Digite um numero: ");
	        vet[i] = s.nextDouble();
	        soma = soma + vet[i];
		}
		med = soma / N;
		System.out.printf("\nMEDIA DO VETOR = %.3f\n", med);
		System.out.println("ELEMENTOS ABAIXO DA MEDIA: ");
		for (i = 0; i < N; i++) {
			if (vet[i] < med) {
				System.out.println(vet[i]);
			}
		}
		s.close();
	}
}
