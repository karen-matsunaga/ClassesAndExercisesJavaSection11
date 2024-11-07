package curso_java;
import java.util.Scanner;

// EXERCÍCIO ERRADO - 25/9/24

public class Combustivel {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int cod, alc = 0, gas = 0, die = 0;
		System.out.print("Informe um codigo (1, 2, 3) ou 4 para pagar: ");
		cod = s.nextInt();
		while (cod != 4) {
			// MINHA RESPOSTA
//			System.out.print("Informe um codigo (1, 2, 3) ou 4 para pagar: ");
//			cod = s.nextInt();
			if (cod == 1) {
				alc++;
			}
			else if (cod == 2) {
				gas++;
			}
			else if (cod == 3) {
				die++;
			}
			// RESPOSTA EXERCÍCIO
			System.out.print("Informe um codigo (1, 2, 3) ou 4 para pagar: ");
			cod = s.nextInt();
		}
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + alc);
		System.out.println("Gasolina: " + gas);
		System.out.println("Diesel: " + die);
		s.close();
	}
}
