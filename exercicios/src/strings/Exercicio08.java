package strings;
import java.util.Scanner;
public class Exercicio08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String frase, fraseInversa = "", novaFrase = "";
		
		System.out.print("Informe uma frase: ");
		frase = input.nextLine();
		frase = frase.toUpperCase();

		for (int i = 0; i < frase.length(); i++) {
			if (frase.charAt(i) != ' ' && frase.charAt(i) != '!' && frase.charAt(i) != '.' &&
				frase.charAt(i) != ',' && frase.charAt(i) != ';' && frase.charAt(i) != '?' &&
				frase.charAt(i) != ':' && frase.charAt(i) != '-' && frase.charAt(i) != '(' &&
				frase.charAt(i) != ')' && frase.charAt(i) != '_') {
				
				novaFrase += frase.charAt(i);
			}
			
		}
			
		for (int i = novaFrase.length() - 1; i >= 0; i--) {
			fraseInversa += novaFrase.charAt(i);
			
			
		}
		
		if (novaFrase.equals(fraseInversa))
			System.out.println(frase + " é palindromo.");
		else
			System.out.println(frase + " não é palindromo.");
		input.close();
	}

}
/*
Palíndromo. Um palíndromo é uma seqüência de caracteres cuja leitura é idêntica se feita da direita para esquerda ou vice−versa. Por exemplo: OSSO e OVO são palíndromos. Em textos mais complexos os espaços e pontuação são ignorados. A frase SUBI NO ONIBUS é o exemplo de uma frase palíndroma onde os espaços foram ignorados. Faça um programa que leia uma seqüência de caracteres, mostre−a e diga se é um palíndromo ou não.

*/