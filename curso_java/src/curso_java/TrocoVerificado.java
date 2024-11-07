package curso_java;
import java.util.Locale;
import java.util.Scanner;

// EXERCÍCIO CORRETO - 23/9/24

public class TrocoVerificado {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner s = new Scanner(System.in);

		double produto, dinheiro, troco;
		int qtd;

		System.out.print("Preco unitario do produto: ");
		produto = s.nextDouble();

		System.out.print("Quantidade comprada: ");
		qtd = s.nextInt();

		System.out.print("Dinheiro recebido: ");
		dinheiro = s.nextDouble();

		if (produto * qtd > dinheiro) {
			troco = produto * qtd - dinheiro;
			System.out.println("DINHEIRO INSUFICIENTE. "
					+ "FALTAM " + String.format("%.2f", troco) + " REAIS");
		}
		else {
			troco = dinheiro - produto * qtd;
			System.out.println("TROCO = " + String.format("%.2f", troco));

		}
		s.close();
	}
}