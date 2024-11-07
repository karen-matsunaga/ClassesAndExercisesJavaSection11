package curso_java;
import java.util.Locale;
import java.util.Scanner;

// EXERCÍCIO CORRETO - 25/9/24

public class Experiencias {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner s = new Scanner(System.in);
		int N, i, cob = 0, coe = 0, rat = 0, sap = 0, tot = 0;
		double pc, pr, ps;
		char t;
		System.out.print("Quantos casos de teste serao digitados? ");
		N = s.nextInt();
		for (i = 0; i < N; i++) {
			System.out.print("Quantidade de cobaias: ");
			cob = s.nextInt();
			System.out.print("Tipo de cobaia: ");
			t = s.next().charAt(0);
			if (t == 'C') {
				coe = coe + cob;
			}
			else if (t == 'R') {
				rat = rat + cob;
			}
			else if (t == 'S') {
				sap = sap + cob;
			}
		}
		tot = coe + rat + sap;
		pc = coe * 100.0 / tot;
		pr = rat * 100.0 / tot;
		ps = sap * 100.0 / tot;
		System.out.println("\nRELATORIO FINAL: ");
		System.out.println("Total: " + tot + " cobaias");
		System.out.println("Total de coelhos: " + coe);
		System.out.println("Total de ratos: " + rat);
		System.out.println("Total de sapos: " + sap);
		System.out.printf("Percentual de coelhos: %.2f\n", pc);
		System.out.printf("Percentual de ratos: %.2f\n", pr);
		System.out.printf("Percentual de sapos: %.2f\n", ps);
		s.close();
	}
}
