package funcoes;
import java.util.Scanner;

public class Exercicio08 {
	
	public static int verificarDigitos(int numero) {
		
		int qtdDigitos = 0;
		
		if ( numero != 0 ) {
		
		while (numero > 0) {
			
			numero /= 10;
			
			qtdDigitos++;
		}
		
		} else
			qtdDigitos = 1;
		
		return qtdDigitos;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		int numero;
		
		System.out.print("Informe um número: ");
		numero = input.nextInt();
		numero = Math.abs(numero);
		
		System.out.println(numero + " possui " + verificarDigitos(numero) + " dígitos.");
		
		input.close();
	}

}
/*
Faça uma função que informe a quantidade de dígitos de um determinado número inteiro informado.
*/