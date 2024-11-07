package curso_java;
import java.util.Locale;
import java.util.Scanner;

// EXERCÍCIO CORRETO - 22/9/24

public class Terreno {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner s = new Scanner(System.in);

		double lar, comp, metro, area, preco;

		System.out.print("Digite a largura do terreno: ");
		lar = s.nextDouble();

		System.out.print("Digite o comprimento do terreno: ");
		comp = s.nextDouble();

		System.out.print("Digite o valor do metro quadrado: ");
		metro = s.nextDouble();

		area = lar * comp;
		System.out.println("Area do terreno = " + String.format("%.2f", area));

		preco = area * metro;
		System.out.println("Preco do terreno = " + String.format("%.2f", preco));

		s.close();
	}
}
