package curso_java;
import java.util.Locale;
import java.util.Scanner;

// EXERCÍCIO CORRETO - 22/9/24

public class Pagamento {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner s = new Scanner(System.in);

		String nome;
		double hV, pag;
		int hT;

		System.out.print("Nome: ");
		nome = s.nextLine();
		System.out.print("Valor por hora: ");
		hV = s.nextDouble();
		System.out.print("Horas trabalhadas: ");
		hT = s.nextInt();

		pag = hV * hT;
		System.out.println("O pagamento para " + nome
				+ " deve ser " + String.format("%.2f", pag));

		s.close();
	}
}
