package strings;
import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String frase;
		int espacoBranco = 0, vogais = 0, a = 0, e = 0, i = 0, o = 0, u = 0;
		char caracterAtual = ' ';
		
		System.out.print("Informe uma frase: ");
		frase = input.nextLine();
		
		for ( int j = 0; j < frase.length(); j++) {
			caracterAtual = frase.charAt(j);
			if (caracterAtual == ' ')
				espacoBranco++;
			else if (caracterAtual == 'a' || caracterAtual == 'A' ||
					 caracterAtual == 'ã' || caracterAtual == 'Ã' ||
					caracterAtual == 'á' || caracterAtual == 'Á' ||
					caracterAtual == 'à' || caracterAtual == 'À' ||
					caracterAtual == 'â' || caracterAtual == 'Â' 
					) {
				a++;
				vogais++;
			}
			else if (caracterAtual == 'e' || caracterAtual == 'E' || 
					caracterAtual == 'ê' || caracterAtual == 'Ê' ||
					caracterAtual == 'é' || caracterAtual == 'É'
					) {
				e++;
				vogais++;
			}
			else if (caracterAtual == 'i' || caracterAtual == 'I' || 
					caracterAtual == 'í' || caracterAtual == 'Í') {
				i++;
				vogais++;
			}
			else if (caracterAtual == 'o' || caracterAtual == 'O' ||
					caracterAtual == 'ô' || caracterAtual == 'Ô' ||
					caracterAtual == 'õ' || caracterAtual == 'Õ' ||
					caracterAtual == 'ó' || caracterAtual == 'Ó' ) {
				o++;
				vogais++;				
			}
			else if (caracterAtual == 'u' || caracterAtual == 'U' ||
					caracterAtual == 'ú' || caracterAtual == 'Ú' ||
					caracterAtual == 'ü' || caracterAtual == 'Ü') {
				u++;
				vogais++;
			}
		}
		
		System.out.println(frase + " possui\n" + espacoBranco + " espaços em branco, ");
		System.out.println( + vogais + " vogais sendo " + a + " a, " + e + " e, " + i +" i, " + o + " o, " + u + " u.");
		
		input.close();

	}

}
/*
Conta espaços e vogais. Dado uma string com uma frase informada pelo usuário (incluindo espaços em branco), conte:

quantos espaços em branco existem na frase.
quantas vezes aparecem as vogais a, e, i, o, u.
*/