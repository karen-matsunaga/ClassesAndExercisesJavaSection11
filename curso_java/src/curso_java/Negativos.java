package curso_java;
import java.util.Scanner;
// EXERCÍCIO CORRETO - 25/9/24
public class Negativos {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N, i;
		System.out.print("Quantos numeros voce vai digitar? ");
		N = s.nextInt();
		int[] vet = new int[N];
		for (i = 0; i < N; i++) {
			System.out.print("Digite um numero: ");
			vet[i] = s.nextInt();
		}
		System.out.println("NUMEROS NEGATIVOS: ");
		for (i = 0; i < N; i++) {
			if (vet[i] < 0) {
				System.out.println(vet[i]);
			}
		}
		s.close();
	}
}
