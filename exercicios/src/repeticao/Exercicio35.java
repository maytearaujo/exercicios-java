package repeticao;
import java.util.Scanner;
import java.util.ArrayList;

public class Exercicio35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner(System.in);
		int numero, contador;
		ArrayList <Integer> numerosPrimos = new ArrayList<>();
		
		do {
			System.out.print("Informe um número positivo: ");
			numero = leitor.nextInt();
		} while (numero <= 0);
		
		for (int i = 1; i <= numero; i++) {
			contador = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					contador++;					
				}
			}
			if (contador == 2 )
				numerosPrimos.add(i);
		}
		System.out.printf("Os números primos entre 1 e %d são: ", numero);
		
		for (int p: numerosPrimos) {
			
			System.out.print(p + " ");
		}
		
		leitor.close();
	}

}
