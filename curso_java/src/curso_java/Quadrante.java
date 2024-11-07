package curso_java;
import java.util.Scanner;

// EXERCÍCIO CORRETO - 25/9/24

public class Quadrante {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int x, y;
		System.out.println("Digite os valores das coordenadas X e Y: ");
		x = s.nextInt();
		y = s.nextInt();
		while (x != 0 && y != 0) {
			if (x > 0 && y > 0) {
				System.out.println("QUADRANTE Q1");
			}
			else if (x < 0 && y > 0) {
				System.out.println("QUADRANTE Q2");
			}
			else if (x < 0 && y < 0) {
				System.out.println("QUADRANTE Q3");
			}
			else {
				System.out.println("QUADRANTE Q4");
			}
			System.out.println("Digite os valores das coordenadas X e Y: ");
			x = s.nextInt();
			y = s.nextInt();
		}
		s.close();
	}
}
