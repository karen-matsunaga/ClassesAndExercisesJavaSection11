package curso_java;
import java.util.Scanner;
// EXERCÍCIO CORRETO - 26/9/24
public class CadaLinha {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n, i, j;
		System.out.print("Qual a ordem da matriz? ");
		n = s.nextInt();
		int[][] mat = new int[n][n];
		int[] vet = new int[n];
		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++) {
				System.out.printf("Elemento [%d,%d]: ", i, j);
				mat[i][j] = s.nextInt();
			}
		}
		int maior = mat[0][0];
	    System.out.println("MAIOR ELEMENTO DE CADA LINHA:");
	    for (i = 0; i < n; i++) {
	    	maior = mat[i][0];
	    	for (j = 0; j < n; j++) {
	    		if (mat[i][j] > maior) {
	    			maior = mat[i][j];
	    		}
	    	}
	    	vet[i] = maior;
	    }
	    for (i = 0; i < n; i++) {
	    	System.out.println(vet[i]);
	    }
		s.close();
	}
}
