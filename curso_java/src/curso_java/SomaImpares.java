package curso_java;
import java.util.Scanner;

// EXERCÍCIO CORRETO - 25/9/24

public class SomaImpares {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int x, y, i, soma = 0, troca;
		System.out.println("Digite dois numeros: ");
		x = s.nextInt();
		y = s.nextInt();
		if (x > y) {
		   troca = x;
		   x = y;
		   y = troca;
		}
		for (i = x+1; i < y; i++) {
			if (i % 2 != 0) {
				soma = soma + i;
			}
		}
		System.out.println("SOMA DOS IMPARES = " + soma);
		s.close();
	}
}
