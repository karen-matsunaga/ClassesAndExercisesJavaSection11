package curso_java;
import java.util.Scanner;

// EXERCÍCIO CORRETO - 25/9/24

public class SenhaFixa {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int senha;
		System.out.print("Digite a senha: ");
		senha = s.nextInt();
		while (senha != 2002) {
			System.out.print("Senha invalida! Tente novamente: ");
	        senha = s.nextInt();
		}
		System.out.println("Acesso permitido!");
		s.close();
	}
}
