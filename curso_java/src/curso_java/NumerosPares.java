package curso_java;
import java.util.Scanner;
// EXERCÍCIO CORRETO - 25/9/24
public class NumerosPares {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N, i, cont = 0;
		System.out.print("Quantos numeros voce vai digitar? ");
		N = s.nextInt();
		int[] vet = new int[N];
		for (i = 0; i < N; i++) {
			System.out.print("Digite um numero: ");
			vet[i] = s.nextInt();
		}
		System.out.println("\nNUMEROS PARES: ");
		for (i = 0; i < N; i++) {
			if (vet[i] % 2 == 0) {
				System.out.print(vet[i] + " ");
				cont++;
			}
		}
		System.out.printf("\n\nQUANTIDADE DE PARES = %d\n", cont);
		s.close();
	}
}
