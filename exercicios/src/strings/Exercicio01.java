package strings;
import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String texto1, texto2;
		
		System.out.print("Informe o 1º texto, frase ou palavra: ");
		texto1 = input.nextLine();
				
		System.out.print("Informe o 2º texto, frase ou palavra: ");
		texto2 = input.nextLine();
		
		System.out.println("\nCompara duas strings\n");
		System.out.printf("String 1: %s\n", texto1);
		System.out.printf("String 2: %s\n", texto2);
		System.out.printf("Tamanho de \"%s\": %d caracteres\n", texto1, texto1.length());
		System.out.printf("Tamanho de \"%s\": %d caracteres\n", texto2, texto2.length());
		
		if (texto1.length() == texto2.length())
			System.out.println("As duas strings são de tamanhos iguais.");
		else
			System.out.println("As duas strings são de tamanhos diferentes.");
		
		if (texto1.equals(texto2))
			System.out.println("As duas strings possuem conteúdos iguais.");
		else
			System.out.println("As duas strings possuem conteúdos diferentes.");
		
		input.close();
	}

}

/*
Tamanho de strings. Faça um programa que leia 2 strings e informe o conteúdo delas seguido do seu comprimento. Informe também se as duas strings possuem o mesmo comprimento e são iguais ou diferentes no conteúdo.

Compara duas strings
String 1: Brasil Hexa 2006
String 2: Brasil! Hexa 2006!
Tamanho de "Brasil Hexa 2006": 16 caracteres
Tamanho de "Brasil! Hexa 2006!": 18 caracteres
As duas strings são de tamanhos diferentes.
As duas strings possuem conteúdo diferente.
*/
