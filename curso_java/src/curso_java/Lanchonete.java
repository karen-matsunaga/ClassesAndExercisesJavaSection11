package curso_java;
import java.util.Locale;
import java.util.Scanner;

// EXERCÍCIO CORRETO - 23/9/24

public class Lanchonete {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner s = new Scanner(System.in);

		int cod, qtd;
		double total;
		System.out.print("Codigo do produto comprado: ");
		cod = s.nextInt();
		System.out.print("Quantidade comprada: ");
		qtd = s.nextInt();

		if (cod == 1) {
			total = 5.00 * qtd;
			System.out.print("Valor a pagar: R$ " + String.format("%.2f", total));
		}
		else if (cod == 2) {
			total = 3.50 * qtd;
			System.out.print("Valor a pagar: R$ " + String.format("%.2f", total));
		}
		else if (cod == 3) {
			total = 4.80 * qtd;
			System.out.print("Valor a pagar: R$ " + String.format("%.2f", total));
		}
		else if (cod == 4) {
			total = 8.90 * qtd;
			System.out.print("Valor a pagar: R$ " + String.format("%.2f", total));
		}
		else if (cod == 5) {
			total = 7.32 * qtd;
			System.out.print("Valor a pagar: R$ " + String.format("%.2f", total));
		}
		s.close();
	}
}