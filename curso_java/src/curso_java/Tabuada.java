package curso_java;
import java.util.Scanner;

// EXERCÍCIO CORRETO - 25/9/24

public class Tabuada {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N, i;
		System.out.print("Deseja a tabuada para qual valor? ");
		N = s.nextInt();
		for (i = 0; i <= 10; i++) {
			System.out.println(N + " x " + i + " = " + (N * i));
		}
		s.close();
	}

}
