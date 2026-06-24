package strings;
import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String nome, nomeVertical="";

		
		System.out.print("Informe seu nome: ");
		nome = input.nextLine();
		
		nome = nome.toUpperCase();
		
		for ( int i = 0; i < nome.length(); i++) {
			System.out.println(nomeVertical+=nome.charAt(i));
		}
		
		input.close();
	}

}

/*
Nome na vertical em escada. Modifique o programa anterior de forma a mostrar o nome em formato de escada.

F
FU
FUL
FULA
FULAN
FULANO

*/