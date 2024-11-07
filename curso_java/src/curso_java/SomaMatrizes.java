package curso_java;
import java.util.Scanner;
// EXERCÍCIO CORRETO - 26/9/24
public class SomaMatrizes {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int m, n, i, j;
		System.out.print("Quantas linhas vai ter cada matriz? ");
		m = s.nextInt();
		System.out.print("Quantas colunas vai ter cada matriz? ");
        n = s.nextInt();
        int[][] a = new int[m][n];
        int[][] b = new int[m][n];
        int[][] c = new int[m][n];
        System.out.println("Digite os valores da matriz A: ");
        for (i = 0; i < m; i++) {
        	for (j = 0; j < n; j++) {
        		System.out.printf("Elemento [%d,%d]: ", i, j);
        		a[i][j] = s.nextInt();
        	}
        }
        System.out.println("Digite os valores da matriz B: ");
        for (i = 0; i < m; i++) {
        	for (j = 0; j < n; j++) {
        		System.out.printf("Elemento [%d,%d]: ", i, j);
        		b[i][j] = s.nextInt();
        	}
        }
        System.out.println("MATRIZ SOMA:");
        for (i = 0; i < m; i++) {
        	for (j = 0; j < n; j++) {
        		c[i][j] = a[i][j] + b[i][j];
        		System.out.print(c[i][j] + " ");
        	}
        	System.out.println();
        }
		s.close();
	}
}
