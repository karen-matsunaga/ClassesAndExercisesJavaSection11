package curso_java;
import java.util.Locale;
import java.util.Scanner;
// EXERCÍCIO CORRETO - 26/9/24
public class MatrizGeral {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner s = new Scanner(System.in);
		int n, i, j;
		System.out.print("Qual a ordem da matriz? ");
		n = s.nextInt();
		double[][] mat = new double[n][n];
		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++) {
				System.out.printf("Elemento [%d,%d]: ", i, j);
				mat[i][j] = s.nextDouble();
			}
		}
		double soma = 0;
		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++) {
				if (mat[i][j] > 0.0) {
					soma = soma + mat[i][j];
				}
			}
		}
		System.out.printf("\nSOMA DOS POSITIVOS = %.1f\n", soma);
		int l, c;
		System.out.print("\nEscolha uma linha: ");
		l = s.nextInt();
		System.out.print("LINHA ESCOLHIDA: ");
		for (j = 0; j < n; j++) {
			System.out.printf("%.1f ", mat[l][j]);
		}
		System.out.print("\n\nEscolha uma coluna: ");
		c = s.nextInt();
		System.out.print("COLUNA ESCOLHIDA: ");
		for (i = 0; i < n; i++) {
			System.out.printf("%.1f ", mat[i][c]);
		}
		System.out.print("\n\nDIAGONAL PRINCIPAL: ");
		for (i = 0; i < n; i++) {
			System.out.printf("%.1f ", mat[i][i]);
		}
		double raiz;
		System.out.println("\n\nMATRIZ ALTERADA:");
		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++) {
				if (mat[i][j] < 0) {
					raiz = Math.pow(mat[i][j], 2.0);
					System.out.print(raiz + " ");
				}
				else {
					System.out.print(mat[i][j] + " ");
				}
			}
			System.out.println();
		}
		s.close();
	}
}
