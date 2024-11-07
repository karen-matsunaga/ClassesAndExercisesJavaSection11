package curso_java;
import java.util.Scanner;

// EXERCÍCIO CORRETO - 25/9/24

public class SequenciaImpares {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int x, i;
		System.out.print("Digite o valor de X: ");
		x = s.nextInt();
		for (i = 0; i <= x; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
		s.close();
	}
}