package curso_java;
import java.util.Scanner;
public class Matrizes {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int M, N, i, j;
		System.out.print("Quantas linhas vai ter a matriz? ");
		M = s.nextInt();
		System.out.print("Quantas colunas vai ter a matriz? ");
		N = s.nextInt();

		int[][] mat = new int[M][N];
		for (i = 0; i < M; i++) {
			for (j = 0; j < N; j++) {
				 System.out.print("Elemento [" + i + "," + j + "]: ");
				 mat[i][j] = s.nextInt();
			}
		}
		System.out.println();
		System.out.println("MATRIZ DIGITADA:");
		for (i = 0; i < M; i++) {
			for (j = 0; j < N; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
        s.close();
	}

}
