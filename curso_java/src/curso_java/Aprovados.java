package curso_java;
import java.util.Locale;
import java.util.Scanner;
// EXERCÍCIO CORRETO - 26/9/24
public class Aprovados {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner s = new Scanner(System.in);
		int N, i;
		double med = 0;
		System.out.print("Quantos alunos serao digitados? ");
		N = s.nextInt();
		String[] nome = new String[N];
		double[] n1 = new double[N];
		double[] n2 = new double[N];
		for (i = 0; i < N; i++) {
			System.out.println("Digite nome, primeira e segunda nota do " + (i+1) + "o aluno: ");
			s.nextLine();
			nome[i] = s.nextLine();
			n1[i] = s.nextDouble();
			n2[i] = s.nextDouble();
		}
		System.out.println("Alunos aprovados:");
		for (i = 0; i < N; i++) {
		    med = (n1[i] + n2[i]) / 2.0;
			if (med >= 6) {
			   System.out.println(nome[i]);
		    }
		}
		s.close();
	}
}
