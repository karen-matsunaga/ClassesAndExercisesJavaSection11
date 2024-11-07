package curso_java;
import java.util.Scanner;

 EXERCÍCIO CORRETO - 24/9/24

public class Crescente {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int x, y;
		System.out.println("Digite dois numeros: ");
		x = s.nextInt();
		y = s.nextInt();
		while (x != y) {
			if (x > y) {
				System.out.println("DECRESCENTE!");
			}
			else {
				System.out.println("CRESCENTE!");
			}
			System.out.println("Digite outro dois numeros: ");
			x = s.nextInt();
			y = s.nextInt();
		}
		s.close();
	}
}