package strings;
import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner(System.in);
		String nome, nomeInverso = "";
		
		System.out.print("Informe seu nome: ");
		nome = leitor.nextLine();
		
		nome = nome.toUpperCase();
		
		for (int i = nome.length() - 1; i >= 0 ; i--) {
			nomeInverso += nome.charAt(i);
		}
		
		System.out.println(nomeInverso);
		leitor.close();
	}

}

/*
Nome ao contrário em maiúsculas. Faça um programa que permita ao usuário digitar o seu nome e em seguida mostre o nome do usuário de trás para frente utilizando somente letras maiúsculas. Dica: lembre−se que ao informar o nome o usuário pode digitar letras maiúsculas ou minúsculas
*/