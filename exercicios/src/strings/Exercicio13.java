package strings;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Exercicio13 {
	
	public static ArrayList <String> lerArquivo() {

		String caminho = "string_exercicio13.txt";
		ArrayList <String> linhas = new ArrayList<>();
		String linha;
		
		try (BufferedReader leitor = new BufferedReader (new FileReader(caminho))) {
			
			while ((linha = leitor.readLine()) != null) {
				linhas.add(linha);
			}
			
		} catch (Exception erro) {
			linha = erro.getMessage();
			linhas.add(linha);
		}
		return linhas;
	}

	public static int sorteiaPalavra(int tamanhoArray) {
		
		Random gerador = new Random();
		int indiceSorteado;
		
		indiceSorteado = gerador.nextInt(tamanhoArray);
		
		return indiceSorteado;
	}
	
	public static String embaralhaPalavra(String palavraSorteada) {

		Random gerador = new Random();
		int indiceSorteado;
		String palavraEmbaralhada = "";
		ArrayList <Integer> indicesSorteados = new ArrayList<>();		
		
		for (int i = 0; i < palavraSorteada.length(); i++) {
			do {
				indiceSorteado = gerador.nextInt(palavraSorteada.length());
			}
			while (indicesSorteados.contains(indiceSorteado));
			
		
				indicesSorteados.add(indiceSorteado);
				palavraEmbaralhada += palavraSorteada.charAt(indiceSorteado);
			
			
		}
		return palavraEmbaralhada;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <String> palavras =  new ArrayList<>();
		int indiceSorteado, tentativas = 0;
		String palavraSorteada, palavraEmbaralhada, palavra;
		Scanner input = new Scanner(System.in);
		palavras = lerArquivo();
		indiceSorteado = sorteiaPalavra(palavras.size());
		palavraSorteada = palavras.get(indiceSorteado);
		palavraEmbaralhada = embaralhaPalavra(palavraSorteada);
				
		System.out.println("Palavra Embaralhada: " + palavraEmbaralhada);
		
		do {
			
			tentativas++;			
			System.out.print("\n <-- " + tentativas +"ª tentativa\nInforme a palavra: ");
			palavra = input.nextLine();
			palavra = palavra.toUpperCase();
						
		} while (tentativas < 6 && !palavra.equals(palavraSorteada));
		
		if (palavra.equals(palavraSorteada))
			System.out.println("\nVocê venceu.");
		else
			System.out.println("\nVocê perdeu.");
		
		System.out.println("\nA palavra correta é: " + palavraSorteada);
		input.close();

	}

}

/*
Jogo da palavra embaralhada. Desenvolva um jogo em que o usuário tenha que adivinhar uma palavra que será mostrada com as letras embaralhadas. O programa terá uma lista de palavras lidas de um arquivo texto e escolherá uma aleatoriamente. O jogador terá seis tentativas para adivinhar a palavra. Ao final a palavra deve ser mostrada na tela, informando se o usuário ganhou ou perdeu o jogo.

*/