package strings;
import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String nome;
		
		System.out.print("Informe seu nome: ");
		nome = input.nextLine();
		
		nome = nome.toUpperCase();
		
		for ( int i = 0; i < nome.length(); i++) {
			System.out.println(nome.charAt(i));
		}
		
		input.close();
	}

}

/*
Nome na vertical. Faça um programa que solicite o nome do usuário e imprima-o na vertical.

F
U
L
A
N
O
*/