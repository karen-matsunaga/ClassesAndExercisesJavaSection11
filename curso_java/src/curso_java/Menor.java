package curso_java;
import java.util.Scanner;

// EXERCÍCIO CORRETO - 22/9/24

public class Menor {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int a, b, c, menor;

		System.out.print("Primeiro valor: ");
		a = s.nextInt();

		System.out.print("Segundo valor: ");
		b = s.nextInt();

		System.out.print("Terceiro valor: ");
		c = s.nextInt();

		if (a < b && a < c) {
			menor = a;
		}
		else if (b < c) {
			menor = b;
		}
		else {
			menor = c;
		}

		System.out.println("MENOR = " + menor);

		s.close();
	}
}
