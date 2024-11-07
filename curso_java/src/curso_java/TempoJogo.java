package curso_java;
import java.util.Scanner;

// EXERCÍCIO CORRETO - 23/9/24

public class TempoJogo {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int i, f;
		System.out.print("Hora inicial: ");
		i = s.nextInt();
		System.out.print("Hora final: ");
		f = s.nextInt();

		// MINHA RESPOSTA
		if (i >= f) {
			System.out.println("O JOGO DUROU " + (24 - i + f) + " HORA(S)");
		}
		else if (f > i){
			System.out.println("O JOGO DUROU " + (f - i) + " HORA(S)");
		}
		// RESPOSTA EXERCÍCIO
//		if (i < f) {
//		    System.out.println("O JOGO DUROU " + (f - i) + " HORA(S)");
//		}
//		else {
//			System.out.println("O JOGO DUROU " + (24 - (i - f)) + " HORA(S)");
//		}
		s.close();
	}
}
