package curso_java;
import java.util.Scanner;
// EXERCÍCIO CORRETO - 26/9/24
public class DiagonalNegativos {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n, i, j, neg = 0;
		System.out.print("Qual a ordem da matriz? ");
		n = s.nextInt();
		int[][] mat = new int[n][n];
		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++) {
				System.out.printf("Elemento [%d,%d]: ", i, j);
				mat[i][j] = s.nextInt();
			}
		}
		System.out.println("DIAGONAL PRINCIPAL:");
		for (i = 0; i < n; i++) {
            System.out.printf(mat[i][i] + " ");
		}
		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++) {
				if (mat[i][j] < 0) {
					neg++;
				}
			}
		}
		System.out.printf("\nQUANTIDADE DE NEGATIVOS = %d\n", neg);
		s.close();
	}
}
