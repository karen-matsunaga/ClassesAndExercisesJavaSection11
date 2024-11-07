package curso_java;

import java.util.Locale; // SUBSTITUI , PELO . NAS CASAS DECIMAIS
import java.util.Scanner; // ENTRADA / LEITURA DOS DADOS

// DICA! APERTE OS SEGUINTES ATALHOS: CTRL + SHIFT + O PARA ADICIONAR AS BIBLIOTECAS

public class Entrada {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US); // SEMPRE FAZER ANTES DO SCANNER - OBRIGATÓRIO
		Scanner sc = new Scanner(System.in); // DEPOIS DO LOCALE - OBRIGATÓRIO

		double salario1, salario2;
		String nome1, nome2;
		int idade;
		char sexo;

		System.out.print("Nome da primeira pessoa: ");
		nome1 = sc.nextLine(); // LER O NOME E A QUEBRA DE LINHA JUNTAS
		System.out.print("Salario da primeira pessoa: ");
		salario1 = sc.nextDouble(); // QUEBRA DE LINHA PENDENTE

		System.out.print("Nome da segunda pessoa: ");
		sc.nextLine(); // REMOVER A QUEBRA DE LINHA DA LEITURA ANTERIOR
		nome2 = sc.nextLine(); // LER O NOME E A QUEBRA DE LINHA JUNTAS
		System.out.print("Salario da segunda pessoa: ");
		salario2 = sc.nextDouble();

		System.out.print("Digite uma idade: ");
		idade = sc.nextInt();
		System.out.print("Digite um sexo (F/M): ");
		sexo = sc.next().charAt(0); // LER SOMENTE A PRIMEIRA LETRA QUE ESTÁ NA POSIÇÃO 0

		System.out.println("Nome 1: " + nome1);
		System.out.println("Salario 1: " + String.format("%.2f", salario1));
		System.out.println("Nome 2: " + nome2);
		System.out.println("Salario 2: " + String.format("%.2f", salario2));
		System.out.println("Idade: " + idade);
		System.out.println("Sexo: " + sexo);

		sc.close(); // DESLOCAR O QUE FOI DIGITADO ANTERIORMENTE
	}
}
