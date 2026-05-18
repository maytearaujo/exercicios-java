package repeticao;
import java.util.Scanner;

public class Exercicio36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner(System.in);
		int numero, inicio, fim;
		
		System.out.print("Informe um número da tabuada: ");
		numero = leitor.nextInt();
		
		System.out.print("Informe o inicio da tabuada: ");
		inicio = leitor.nextInt();
		
		do {
			System.out.print("Informe o fim da tabuada: ");
			fim = leitor.nextInt();
		} while ( fim < inicio);
			
		System.out.printf("\nMontar a tabuada do: %d\n"
				+ "Começar por:  %d\n"
				+"Terminar em:  %d\n",
				numero, inicio, fim);

		for (int i = inicio; i <= fim; i++)
			System.out.println(numero + " X " + i + " = " + (numero*i));

	}

}
