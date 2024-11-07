package curso_java;
import java.util.Locale;
import java.util.Scanner;

// EXERCÍCIO CORRETO - 25/9/24

public class MaiorPosicao {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner s = new Scanner(System.in);
		int N, i, pos = 0;
		// MINHA RESPOSTA
		double maior = 0;
		System.out.print("Quantos numeros voce vai digitar? ");
		N = s.nextInt();
		double[] vet = new double[N];
		// RESPOSTA EXERCÍCIO
//		double maior = vet[0];
		for (i = 0; i < N; i++) {
			System.out.print("Digite um numero: ");
			vet[i] = s.nextDouble();
		}
		for (i = 0; i < N; i++) {
			if (vet[i] > maior) {
				maior = vet[i];
				pos = i;
			}
		}
		System.out.printf("\nMAIOR VALOR = %.1f\n", maior);
		System.out.println("POSICAO DO MAIOR VALOR = " + pos);
		s.close();
	}
}
