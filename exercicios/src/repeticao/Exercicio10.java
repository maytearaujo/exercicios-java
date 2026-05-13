package repeticao;
import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner(System.in);
		int num1, num2;
		
		System.out.print("Informe o 1º número: ");
		num1 = leitor.nextInt();

		do {
			System.out.print("Informe o 2º número: ");
			num2 = leitor.nextInt();
			
			if (num2 < num1)
				System.out.println("O 2º número precisa ser maior que o 1º");
		}
		while (num2 < num1);
		
		for (int i = num1+1; i < num2; i++ )
			System.out.print(i + " ");
		
		leitor.close();
	}

}
