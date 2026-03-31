package numero;
import java.util.Scanner;

public class Numero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		int num; 
		
		System.out.println("Informe um numero: ");
		num = leia.nextInt();
		
		System.out.printf("O número informado é: %d", num);
	}

}
