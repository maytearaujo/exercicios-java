package repeticao;
import java.util.Scanner;

public class Exercicio42 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int contador0_25 = 0, contador26_50 = 0, contador51_75 = 0, contador76_100 = 0, numero;
		
		do {
			System.out.print("Informe um número: ");
			numero = input.nextInt();
			
			if (numero >= 0 && numero <= 25)
				contador0_25++;
			else if (numero >= 26 && numero <= 50)
				contador26_50++;
			else if (numero >= 51 && numero <= 75)
				contador51_75++;
			else if (numero >= 76 && numero <= 100)
				contador76_100++;
				
		} while (numero >= 0);
		
		System.out.printf("Quantidade de números nos intervalos: \n"
				+ "[0-25] [26-50] [51-75] [76-100]%n %-8d %-8d %-8d %d", contador0_25, contador26_50, contador51_75, contador76_100);
		input.close();
	}

}

/*
Faça um programa que leia uma quantidade indeterminada de números positivos e conte quantos deles estão nos seguintes 
intervalos: [0-25], [26-50], [51-75] e [76-100]. A entrada de dados deverá terminar quando for lido um número negativo
*/