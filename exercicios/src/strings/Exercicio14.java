package strings;
import java.util.Scanner;

public class Exercicio14 {
	
	public static String leetSpek(String frase) {
		String novaFrase = "";
		
		char[] letras = {
			    'A', 'B', 'C', 'D', 'E', 'F', 'G',
			    'H', 'I', 'J', 'K', 'L', 'M',
			    'N', 'O', 'P', 'Q', 'R', 'S',
			    'T', 'U', 'V', 'W', 'X', 'Y', 'Z'
			};

			char[] leet = {
			    '4', '8', '(', 'D', '3', 'F', '6',
			    '#', '1', 'J', 'K', '1', 'M',
			    'N', '0', 'P', 'Q', 'R', '5',
			    '7', 'U', 'V', 'W', 'X', 'Y', '2'
			};
		
		char [] arrayFrase;
		
		frase = frase.toUpperCase();
		arrayFrase = frase.toCharArray();
		
		for (int i = 0; i < frase.length(); i++) {
			for (int j = 0; j < letras.length; j++){
				if (frase.charAt(i) == letras[j]) {
					arrayFrase[i] = leet[j];
				}
			}
			
		}
		
		novaFrase = new String(arrayFrase);
		return novaFrase;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String frase;
		
		System.out.print("Digite uma frase: ");
		frase = input.nextLine();
		
		System.out.println("Frase em Leet Spek: " + leetSpek(frase));
		
		input.close();

	}

}


/*
Leet spek generator. Leet é uma forma de se escrever o alfabeto latino usando outros símbolos em lugar das letras, como números por exemplo. A própria palavra leet admite muitas variações, como l33t ou 1337. O uso do leet reflete uma subcultura relacionada ao mundo dos jogos de computador e internet, sendo muito usada para confundir os iniciantes e afirmar-se como parte de um grupo. Pesquise sobre as principais formas de traduzir as letras. Depois, faça um programa que peça uma texto e transforme-o para a grafia leet speak.
*/