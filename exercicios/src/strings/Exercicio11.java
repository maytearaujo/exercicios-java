package strings;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Exercicio11 {
	
	public static ArrayList <String> lerArquivo() {

		String caminho = "arquivos\\string_exercicio11.txt";
		ArrayList <String> linhas = new ArrayList<>();
		String linha;
		
		try (BufferedReader leitor = new BufferedReader (new FileReader(caminho))) {
			
			while ((linha = leitor.readLine()) != null) {
				linhas.add(linha);
			}
			
		} catch (Exception e) {
			e.getStackTrace();
			linha = e.getMessage();
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
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <String> palavras =  new ArrayList<>();
		ArrayList <Character> letrasCorretas = new ArrayList<>();
		ArrayList <Character> letrasDigitadas = new ArrayList<>();
		int indiceSorteado, erros = 0, acertos = 0;
		char letra;
		Scanner input = new Scanner(System.in);
		String palavraSorteada;
		boolean acerto = false, encontrou = false;
		String formarPalavra = "";
		
		palavras = lerArquivo();
		indiceSorteado = sorteiaPalavra(palavras.size());		
		palavraSorteada = palavras.get(indiceSorteado);
		
		do {
			System.out.print("Digite uma letra: ");
			letra = input.next().charAt(0);
			
			if (!letrasDigitadas.contains(letra)) {
				
				letrasDigitadas.add(letra);
				
				if (palavraSorteada.indexOf(letra) != -1) {
						for (int i = 0; i < palavraSorteada.length(); i++) {
							
							if (palavraSorteada.charAt(i) == letra) {
								acerto = true;
								acertos++;
	
							}
						}
						
						if (acerto) {
							
							letrasCorretas.add(letra);
						}
				} else {
					acerto = false;
				}
				
				if (acerto) {
					
					System.out.print("A palavra é: ");
					
					for (int i = 0; i < palavraSorteada.length(); i++) {
						
						for (int j = 0; j < letrasCorretas.size(); j++) {
											
							if (palavraSorteada.charAt(i) == letrasCorretas.get(j) ) {
								
								encontrou = true;
								
							}	
						}
						
						if(encontrou) {
							formarPalavra += palavraSorteada.charAt(i) + "";
							encontrou = false;
						} else {
							formarPalavra += "_ ";
						}
						
					}
					System.out.println(formarPalavra);
				}
				else {
					
					erros++;
					System.out.print("-> Você errou pela " + erros + "ª vez.");
					
					if ( erros != 6)
						System.out.print (" Tente de novo!\r\n");
					else
						System.out.print(" Perdeu o jogo.");
				}
				
				
				if (palavraSorteada.equals(formarPalavra))
					System.out.print(" Você venceu o jogo.");
	
				formarPalavra = "";
	
				System.out.println("");
			} else {
				System.out.println("A letra " + letra + " já foi digitada anteriormente\n");
			}
		} while (erros < 6 && acertos < palavraSorteada.length());
		
		//input.close();
	}

}
/*
Jogo de Forca. Desenvolva um jogo da forca. O programa terá uma lista de palavras lidas de um arquivo texto e escolherá uma aleatoriamente. O jogador poderá errar 6 vezes antes de ser enforcado.

Digite uma letra: A
-> Você errou pela 1ª vez. Tente de novo!

Digite uma letra: O
A palavra é: _ _ _ _ O

Digite uma letra: E
A palavra é: _ E _ _ O

Digite uma letra: S
-> Você errou pela 2ª vez. Tente de novo!
*/