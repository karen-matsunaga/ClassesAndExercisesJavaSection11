package curso_java;
import java.util.Scanner;

// EXERCÍCIO ERRADO - 25/9/24

public class Fatorial {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int N, i, f = 1;
		System.out.print("Digite o valor de N: ");
		N = s.nextInt();

		for (i = N; i > 0; i--) {
			// MINHA RESPOSTA
			// f = N * i;
			// RESPOSTA EXERCÍCIO
			f = f * i;
		}
		System.out.printf("FATORIAL = %d", f);

		s.close();
	}
}
