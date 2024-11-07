package curso_java;
import java.util.Scanner;

// EXERCÍCIO CORRETO - 25/9/24

public class DentroFora {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int N, i, x, d = 0, f = 0;
		System.out.print("Quantos numeros voce vai digitar? ");
		N = s.nextInt();
		for (i = 0; i < N; i++) {
			System.out.print("Digite um numero: ");
			x = s.nextInt();
			if (x >= 10 && x <= 20) {
				d++;
			}
			else {
				f++;
			}
		}
		System.out.println(d + " DENTRO\n" + f + " FORA\n");
		s.close();
	}
}
