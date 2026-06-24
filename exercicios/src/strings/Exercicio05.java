package strings;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String nome;

		
		System.out.print("Informe seu nome: ");
		nome = input.nextLine();
		
		nome = nome.toUpperCase();

		
		for ( int i = 0; i < nome.length(); i++) {
			//nomeVertical-=nome.substring(nome.length());
			System.out.println(nome.substring(i));
		}
		
		input.close();

	}

}

/*
Nome na vertical em escada invertida. Altere o programa anterior de modo que a escada seja invertida.

*/