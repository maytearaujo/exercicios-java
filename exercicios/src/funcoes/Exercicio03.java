package funcoes;
import java.util.Scanner;

public class Exercicio03 {
	public static int somarNumeros(int a, int b, int c) {
		int soma;
		
		soma = a + b + c;
		
		return soma;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner(System.in);
		int a, b, c;

		System.out.print("Informe o 1º número: ");
		a = leitor.nextInt();
		
		System.out.print("Informe o 1º número: ");
		b = leitor.nextInt();
		
		System.out.print("Informe o 1º número: ");
		c = leitor.nextInt();		
		
		System.out.println("\nA soma dos números é: " + somarNumeros(a, b, c));
		
		
		leitor.close();
	}

}
/*
Faça um programa, com uma função que necessite de três argumentos, e que forneça a soma desses três argumentos.
*/