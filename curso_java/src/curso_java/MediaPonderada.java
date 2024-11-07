package curso_java;
import java.util.Locale;
import java.util.Scanner;

// EXERCÍCIO CORRETO - 25/9/24

public class MediaPonderada {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner s = new Scanner(System.in);

		int N, i;
		double x, y, z, med = 0;
		System.out.print("Quantos casos voce vai digitar? ");
		N = s.nextInt();

		for (i = 0; i < N; i++) {
			System.out.println("Digite tres numeros: ");
			x = s.nextDouble();
			y = s.nextDouble();
			z = s.nextDouble();
			med = (x * 2.0 + y * 3.0 + z * 5.0) / 10.0;
			System.out.println("MEDIA = " + String.format("%.1f", med));
		}

		s.close();
	}
}
