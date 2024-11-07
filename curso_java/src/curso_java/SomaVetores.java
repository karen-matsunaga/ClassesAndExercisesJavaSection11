package curso_java;
import java.util.Scanner;
// EXERCÍCIO CORRETO 26/9/24
public class SomaVetores {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N, i;
		System.out.print("Quantos valores vai ter cada vetor? ");
		N = s.nextInt();
		int[] a = new int[N];
		int[] b = new int[N];
		int[] c = new int[N];
		System.out.println("Digite os valores do vetor A: ");
		for (i = 0; i < N; i++) {
			a[i] = s.nextInt();
		}
		System.out.println("Digite os valores do vetor B: ");
		for (i = 0; i < N; i++) {
			b[i] = s.nextInt();
		}
		System.out.println("VETOR RESULTANTE: ");
		for (i = 0; i < N; i++) {
			c[i] = a[i] + b[i];
			System.out.println(c[i]);
		}
		s.close();
	}
}
