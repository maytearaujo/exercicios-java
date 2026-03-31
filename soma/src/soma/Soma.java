package soma;
import java.util.Scanner;

public class Soma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		int num1, num2, soma;
		
		System.out.println("Informe o primeiro número: ");
		num1 = leia.nextInt();
		
		System.out.println("Informe o segundo número: ");
		num2 = leia.nextInt();
		
		soma = num1 + num2;
		
		System.out.printf("A soma entre %d e %d é %d", num1, num2, soma);
		
	}

}
