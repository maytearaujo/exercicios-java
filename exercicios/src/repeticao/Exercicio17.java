package repeticao;
import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner(System.in);
		int num, fatorial=1;
		
		do {
			System.out.print("Informe um número para cálculo do fatorial: ");
			num = leitor.nextInt();
		} while (num <= 0);
		
		for (int i = num; i > 0; i--) {
			fatorial = fatorial * i;
		}

		System.out.println("O fatorial de " + num + " é " + fatorial);
	}

}
