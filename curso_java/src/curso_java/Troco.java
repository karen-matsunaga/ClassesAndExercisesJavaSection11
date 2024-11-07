package curso_java;
import java.util.Locale;
import java.util.Scanner;

// EXERCÍCIO CORRETO - 22/9/24

public class Troco {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner s = new Scanner(System.in);

		double prod, din, troco;
		int qtd;
		System.out.print("Preco unitario do produto: ");
		prod = s.nextDouble();
		System.out.print("Quantidade comprada: ");
		qtd = s.nextInt();
		System.out.print("Dinheiro recebido: ");
		din = s.nextDouble();

		troco = din - (prod * qtd);
		System.out.println("TROCO = " + String.format("%.2f", troco));
		s.close();
	}
}
