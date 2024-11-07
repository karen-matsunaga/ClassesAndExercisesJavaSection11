package curso_java;
import java.util.Scanner;
// EXERCÍCIO CORRETO - 26/9/24
public class MaisVelho {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N, i;
		System.out.print("Quantas pessoas voce vai digitar? ");
		N = s.nextInt();
		String[] nome = new String[N];
		int[] idade = new int[N];
		double maior = idade[0];
		for (i = 0; i < N; i++) {
			System.out.printf("Dados da %da pessoa: \n", i+1);
			System.out.print("Nome: ");
			s.nextLine();
			nome[i] = s.nextLine();
			System.out.print("Idade: ");
			idade[i] = s.nextInt();
		}
		for (i = 0; i < N; i++) {
			if (maior < idade[i]) {
				maior = idade[i];
			}
		}
		for (i = 0; i < N; i++) {
			if (idade[i] == maior) {
				System.out.println("PESSOA MAIS VELHA: " + nome[i]);
			}
		}
		s.close();
	}
}
