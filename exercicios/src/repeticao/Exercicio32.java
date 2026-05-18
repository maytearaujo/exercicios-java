package repeticao;
import java.util.Scanner;

public class Exercicio32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner(System.in);
		int numero, i = 1, fatorial = 1;
		
		do {
			System.out.print("Informe um número: ");
			numero = leitor.nextInt();
		} while (numero <= 0);
			
		System.out.print("Fatorial de: " + numero + "! = ");
		i = numero;
		while (i >= 1) {
			fatorial *= i;
			System.out.print(i);
			i--;
			
			if (i > 0)
				System.out.print(" . ");
			else
				System.out.print(" = " + fatorial);
				
		}
		leitor.close();

	}

}
/*
Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário. Ex.: 5!=5.4.3.2.1=120. A saída deve ser conforme o exemplo abaixo:
Fatorial de: 5
5! =  5 . 4 . 3 . 2 . 1 = 120
*/