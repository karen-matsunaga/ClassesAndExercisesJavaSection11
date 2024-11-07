package curso_java;
import java.util.Locale;
import java.util.Scanner;
// EXERCÍCIO CORRETO - 26/9/24
public class SomaLinhas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner s = new Scanner(System.in);
		int m, n, i, j;
		System.out.print("Qual a quantidade de linhas da matriz? ");
		m = s.nextInt();
		System.out.print("Qual a quantidade de colunas da matriz? ");
		n = s.nextInt();
		double[][] mat = new double[m][n];
		double[] vet = new double[m];
		for (i = 0; i < m; i++) {
			System.out.printf("Digite os elementos da %da. linha:\n", i+1);
			for (j = 0; j < n; j++) {
				mat[i][j] = s.nextDouble();
			}
		}
		for (i = 0; i < m; i++) {
			for (j = 0; j < n; j++) {
				vet[i] = vet[i] + mat[i][j];
			}
		}
		System.out.print("VETOR GERADO:\n");
		for (i = 0; i < m; i++) {
			System.out.println(vet[i]);
		}
		s.close();
	}
}
