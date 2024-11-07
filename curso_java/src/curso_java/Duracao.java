package curso_java;
import java.util.Scanner;

// EXERCÍCIO CORRETO - 22/9/24

public class Duracao {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int duracao, resto, horas, minutos, segundos;
		System.out.print("Digite a duracao em segundos: ");
		duracao = s.nextInt();

		horas = duracao / 3600;
		resto = duracao % 3600;
		minutos = resto / 60;
		segundos = resto % 60;

		System.out.println(horas + ":" + minutos + ":" + segundos);
		s.close();
	}
}
