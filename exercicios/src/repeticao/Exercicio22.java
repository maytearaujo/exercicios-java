package repeticao;
import java.util.Scanner;
import java.util.ArrayList;

public class Exercicio22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner(System.in);
		ArrayList <Integer> divisiveis = new ArrayList<>();
		int num, contador = 0;
		
		do {
			System.out.print("Informe um número inteiro: ");
			num = leitor.nextInt();
			
		} while (num <= 0);
		
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				contador++;
				divisiveis.add(i);
			}
		}
		
		if (contador == 2)
			System.out.printf("%d é primo", num);
		else {
			System.out.printf("%d não é primo e é divisivel por ", num);
			for (int d: divisiveis)
				System.out.print(d + " ");
		}
		
		leitor.close();
	}

}
//Altere o programa de cálculo dos números primos, informando, caso o número não seja primo, por quais número ele é divisível.

