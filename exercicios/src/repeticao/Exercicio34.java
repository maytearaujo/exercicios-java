package repeticao;
import java.util.Scanner;

public class Exercicio34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner(System.in);
		int numero, contador = 0;
		
		do {
			System.out.print("Informe um número positivo: ");
			numero = leitor.nextInt();
		} while (numero <= 0);
		
		for (int i = 1; i <= numero; i++) {
			if (numero % i == 0)
				contador++;
		}
		
		if (contador == 2 )
			System.out.println(numero + " é um número primo");
		else
			System.out.println(numero + " não é um número primo");
		
		leitor.close();
	}

}
