package curso_java;
import java.util.Scanner;

// EXERCÍCIO CORRETO - 25/9/24

public class ParImpar {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N, i, x;
		System.out.print("Quantos numeros voce vai digitar? ");
		N = s.nextInt();
		for (i = 0; i < N; i++) {
			System.out.print("Digite um numero: ");
			x = s.nextInt();
			if (x == 0) {
				System.out.println("NULO");
			}
			else if (x > 0 && x % 2 == 0) {
				System.out.println("PAR POSITIVO");
			}
			else if (x < 0 && x % 2 == 0) {
				System.out.println("PAR NEGATIVO");
			}
			else if (x > 0 && x % 2 != 0) {
				System.out.println("IMPAR POSITIVO");
			}
			else {
				System.out.println("IMPAR NEGATIVO");
			}
		}
		s.close();
	}
}
