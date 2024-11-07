package curso_java;
import java.util.Scanner;

// EXERCÍCIO ERRADO VARIAVEL Y NAO USADA NA CONDIÇÃO - 23/9/24

public class Multiplos {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int x, y;
		System.out.println("Digite dois numeros inteiros: ");
		x = s.nextInt();
		y = s.nextInt();

//		if (x % 2 == 0 && y % 2 == 0) {
//		   System.out.println("Sao multiplos");
//		}
		if (x % y == 0 || y % x == 0) {
			System.out.println("Sao multiplos");
		}
		else {
		   System.out.println("Nao sao multiplos");
		}
		s.close();
	}
}
