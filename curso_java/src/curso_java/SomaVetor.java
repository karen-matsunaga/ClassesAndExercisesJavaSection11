package curso_java;
import java.util.Locale;
import java.util.Scanner;
// EXERCÍCIO CORRETO - 25/9/24
public class SomaVetor {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
        Scanner s = new Scanner(System.in);
        int N, i;
        double soma = 0, med;
        System.out.print("Quantos numeros voce vai digitar? ");
        N = s.nextInt();
        double[] vet = new double[N];
        for (i = 0; i < N; i++) {
        	System.out.print("Digite um numero: ");
        	vet[i] = s.nextDouble();
        	soma = soma + vet[i];
        }
        System.out.print("\nVALORES = ");
        for (i = 0; i < N; i++) {
        	System.out.printf("%.1f ", vet[i]);
        }
        System.out.printf("\nSOMA = %.2f\n", soma);
        med = soma / N;
        System.out.printf("MEDIA = %.2f", med);
        s.close();
	}
}
