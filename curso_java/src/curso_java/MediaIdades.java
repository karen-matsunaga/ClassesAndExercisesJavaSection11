package curso_java;
import java.util.Locale;
import java.util.Scanner;
// EXERCÍCIO CORRETO - 25/9/24
public class MediaIdades {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner s = new Scanner(System.in);
		int idade, cont = 0, soma = 0;
		double media = 0;
		System.out.println("Digite as idades: ");
		idade = s.nextInt();
		if (idade < 0) {
			System.out.println("IMPOSSIVEL CALCULAR");
		}
		else {
			while (idade >= 0) {
				if (idade > 0){
					cont++;
					soma = soma + idade;
				}
				else {
					cont--;
				}
				idade = s.nextInt();
			}
			media = (double) soma / cont;
			System.out.println("MEDIA = " + String.format("%.2f", media));
		}
		s.close();
	}
}
