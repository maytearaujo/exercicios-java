package sequencial;
import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		int numero;
		
		System.out.println("Informe o primeiro número: ");
		numero = leia.nextInt();
		
		System.out.printf("O número informado é %d", numero);
		
		leia.close();
	}

}
