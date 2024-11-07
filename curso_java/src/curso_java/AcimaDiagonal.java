package curso_java;
import java.util.Scanner;
// EXERCÍCIO ERRADO - 26/9/24
public class AcimaDiagonal {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n, i, j, soma = 0;
		System.out.print("Qual a ordem da matriz? ");
		n = s.nextInt();
		int[][] mat = new int[n][n];
		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++) {
				System.out.printf("Elemento [%d,%d]: ", i, j);
				mat[i][j] = s.nextInt();
			}
		}
		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++) {
				// MINHA RESPOSTA
//				if (i <= j) {
//					soma = soma - mat[i][j];
//				}
				// RESPOSTA EXERCÍCIO
				if (i < j) {
					soma = soma + mat[i][j];
				}
			}
		}
		System.out.printf("SOMA DOS ELEMENTOS ACIMA DA DIAGONAL PRINCIPAL = %d", soma);
 		s.close();
	}
}
