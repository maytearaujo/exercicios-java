package livro.string;

import java.util.Scanner;

public class StringTokens {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		 String frase;
		 String [] palavras;
		 
		 System.out.println("Digite uma frase e pressione Enter: ");
		 frase = input.nextLine();
		
		 palavras = frase.split(" ");
		 System.out.println("\nNúmero de palavras: " + palavras.length+"\n");
		 
		 for (String palavra: palavras) {
			 System.out.println(palavra);
		 }
	}

}
