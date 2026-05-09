package decisao;
import java.util.Scanner;

public class Exercicio22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner(System.in);
		int numero;
		
		System.out.print("Informe um número: ");
		numero = leitor.nextInt();
		
		if (numero % 2 == 0)
			System.out.println("O número " + numero + " é par");
		else
			System.out.println("O número " + numero + " é impar");

		leitor.close();
	}

}
