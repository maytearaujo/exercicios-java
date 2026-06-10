package listas;
import java.util.Scanner;
import java.util.ArrayList;

public class Exercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leitor = new Scanner(System.in);
		char letra;
		char [] letras = new char [10];
		int qtdConsoantes = 0;
		ArrayList <Character> consoantes = new ArrayList<>();
		
		for (int i = 0; i < 10; i++) {
			do {
				System.out.print("Digite a " + ( i+1) + "ª letra: ");
				letra = leitor.next().charAt(0);
				
				
			} while(!Character.isAlphabetic(letra));

			letras[i] = letra;
		}
		
		for (int i = 0; i < letras.length; i++) {
			if (
					letras[i] != 'a' && 
					letras[i] != 'e' && 
					letras[i] != 'i' && 
					letras[i] != 'o' && 
					letras[i] != 'u' && 
					letras[i] != 'A' && 
					letras[i] != 'E' && 
					letras[i] != 'I' && 
					letras[i] != 'O' && 
					letras[i] != 'U' ) {
				qtdConsoantes++;
				consoantes.add(letras[i]);
			}
		}
		System.out.printf("\nForam cadastradas %d consoantes: ", qtdConsoantes);
		for (Character c: consoantes ) {
			System.out.print(c + " ");
		}
		
		leitor.close();
	}

}

/*
Faça um Programa que leia um vetor de 10 caracteres, e diga quantas consoantes foram lidas. 
Imprima as consoantes.
*/