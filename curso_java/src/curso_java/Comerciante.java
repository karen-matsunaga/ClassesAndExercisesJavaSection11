package curso_java;
import java.util.Locale;
import java.util.Scanner;
// EXERCÍCIO ERRADO - 26/9/24
public class Comerciante {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner s = new Scanner(System.in);
		int N, i, abaixo = 0, entre = 0, acima = 0;
		System.out.print("Serao digitados dados de quantos produtos? ");
		N = s.nextInt();
		String[] p = new String[N];
		double[] c = new double[N];
		double[] v = new double[N];
		// RESPOSTA EXERCÍCIO
		double[] pl = new double[N];
		for (i = 0; i < N; i++) {
			System.out.println("Produto " + (i+1) + ": ");
			System.out.print("Nome: ");
			s.nextLine();
		    p[i] = s.nextLine();
		    System.out.print("Preco de compra: ");
		    c[i] = s.nextDouble();
		    System.out.print("Preco de venda: ");
		    v[i] = s.nextDouble();
		}
		System.out.println("\nRELATORIO: ");
		// MINHA RESPOSTA
//		double compra = 0, venda = 0, total = 0, lucropor = 0;
//		for (i = 0; i < N; i++) {
//			lucropor = ((v[i] - c[i])  * 100) / c[i];
//		}
//
//		for (i = 0; i < N; i++) {
//			if (lucropor < c[i] * 0.1) {
//				abaixo++;
//			}
//			else if (lucropor < c[i] * 0.2) {
//				entre++;
//			}
//			else if (lucropor > c[i] * 0.2){
//				acima++;
//			}
//		}
		// RESPOSTA EXERCÍCIO
		double compra = 0, venda = 0, total = 0;
		for (i = 0; i < N; i++) {
			pl[i] = (v[i] - c[i]) / c[i] * 100.0;
		}
		for (i = 0; i < N; i++) {
			if (pl[i] < 10.0) {
				abaixo++;
			}
			else if (pl[i] < 20.0) {
				entre++;
			}
			else {
				acima++;
			}
		}
		System.out.print("Lucro abaixo de 10%: " + abaixo + "\n");
		System.out.print("Lucro entre 10% e 20%: " + entre + "\n");
		System.out.print("Lucro acima de 20%: " + acima + "\n");
		for (i = 0; i < N; i++) {
			compra = compra + c[i];
			venda = venda + v[i];
		}
		System.out.printf("Valor total de compra: %.2f\n", compra);
		System.out.printf("Valor total de venda: %.2f\n", venda);
		total = venda - compra;
		System.out.printf("Lucro total: %.2f", total);
		s.close();
	}
}
