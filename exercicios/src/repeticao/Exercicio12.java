package repeticao;
import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner(System.in);
		int num;
		
		do {
			System.out.print("Informe um número de 1 a 10: ");
			num = leitor.nextInt();
			
			if (num < 0 || num > 10)
				System.out.println("O número digitado precisa ser de 1 a 10.\n");
			
		} while (num < 0 || num > 10);
		
		System.out.printf("Tabuada do %d\n", num);
		
		for (int i = 1; i <= 10; i++)
			System.out.printf("%d X %d = %d\n", num, i, (num * i));
		
		leitor.close();
	}

}
