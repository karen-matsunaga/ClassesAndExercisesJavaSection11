package curso_java;
import java.util.Locale;
import java.util.Scanner;

// EXERCÍCIO CORRETO - 23/9/24

public class Aumento {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner s = new Scanner(System.in);

		double salario, novoSalario, aumento;
		int porcentagem;

		System.out.print("Digite o salario da pessoa: ");
		salario = s.nextDouble();

		if (salario <= 1000.0) {
		   porcentagem = 20;
		}
		else if (salario <= 3000.0) {
		   porcentagem = 15;
		}
		else if (salario <= 8000.0) {
		   porcentagem = 10;
		}
		else {
		   porcentagem = 5;
		}

		aumento = salario * (porcentagem / 100.0);
		novoSalario = salario + aumento;

		System.out.println("Novo salario = R$ " + String.format("%.2f", novoSalario));
		System.out.println("Aumento = R$ " + String.format("%.2f", aumento));
		System.out.println("Porcentagem = " + porcentagem + " %");
		s.close();
	}
}
