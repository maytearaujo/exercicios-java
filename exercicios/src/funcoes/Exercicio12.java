package funcoes;
import java.util.Scanner;
import java.util.Random;

public class Exercicio12 {
	
	public static String embaralhaPalavra(String palavra) {
		Random gerador = new Random();
		char [] palavraChar;
		char letraAtual;
		
		String palavraEmbaralhada;
		int posicaoGerada, tamanhoPalavra;
		
		tamanhoPalavra = palavra.length();
		
		palavraChar = palavra.toCharArray();
		
		for (int i = 0; i < palavraChar.length ; i++) {
			posicaoGerada = gerador.nextInt(tamanhoPalavra);
			letraAtual = palavraChar[i];
			palavraChar[i] = palavraChar[posicaoGerada];
			palavraChar[posicaoGerada] = letraAtual;

		}
		
		palavraEmbaralhada = new String(palavraChar);
		palavraEmbaralhada = palavraEmbaralhada.toUpperCase();
		
		return palavraEmbaralhada;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner(System.in);
		String palavra;
		
		System.out.print("Informe uma palavra: ");
		palavra = leitor.nextLine();
		
		System.out.println("Palavra Embaralhada: " + embaralhaPalavra(palavra));
		
		leitor.close();

	}

}

/*
Embaralha palavra. Construa uma função que receba uma string como parâmetro e devolva outra string com os carateres embaralhados. Por exemplo: se função receber a palavra python, pode retornar npthyo, ophtyn ou qualquer outra combinação possível, de forma aleatória. Padronize em sua função que todos os caracteres serão devolvidos em caixa alta ou caixa baixa, independentemente de como foram digitados.


*/