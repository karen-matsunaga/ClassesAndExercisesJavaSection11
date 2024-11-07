package curso_java;
import java.util.Scanner;
// EXERCÍCIO CORRETO - 26/9/24
public class NegativosMatriz {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int m, n, i, j;
		System.out.print("Qual a quantidade de linhas da matriz? ");
		m = s.nextInt();
		System.out.print("Qual a quantidade de colunas da matriz? ");
		n = s.nextInt();
		int[][] mat = new int[m][n];
		for (i = 0; i < m; i++) {
			for (j = 0; j < n; j++) {
				System.out.printf("Elemento [%d,%d]: ", i, j);
				mat[i][j] = s.nextInt();
			}
		}
		System.out.println("VALORES NEGATIVOS:");
		for (i = 0; i < m; i++) {
			for (j = 0; j < n; j++) {
				if (mat[i][j] < 0) {
					System.out.println(mat[i][j]);
				}
			}
		}
		s.close();
	}
}
