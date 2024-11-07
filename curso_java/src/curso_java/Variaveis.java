package curso_java;
import java.util.Locale; // USADO PARA ADICIONAR . E SUBSTITUIR , -> EX: 0,1 -> 0.1 (CASAS DECIMAIS)

public class Variaveis {

	public static void main(String[] args) {

	   Locale.setDefault(Locale.US);

	   int idade;
	   double salario, altura;
	   char genero;
	   String nome;

	   idade = 20;
	   salario = 5800.5;
	   altura = 1.63;
	   genero = 'F';
	   nome = "Maria Silva";

	   // EXEMPLO 1
//	   System.out.println("IDADE = " + idade);
//	   System.out.println("SALARIO = " + salario);
//	   System.out.println("ALTURA = " + altura);
//	   System.out.println("GENERO = " + genero);
//	   System.out.println("NOME = " + nome);

	   // DICA para digitar System.out.println(); -> digite sysout + CTRL + Space

	   // EXEMPLO 2
	   System.out.println("IDADE = " + idade);
	   // CUIDADO! A soma aritmética ou adição é representada pelo símbolo +, porém nesse caso é a concatenação de String!!!
	   System.out.println("SALARIO = " + String.format("%.2f", salario));
	   System.out.println("ALTURA = " + String.format("%.2f", altura));
	   System.out.println("GENERO = " + genero);
	   System.out.println("NOME = " + nome);


	}
}
