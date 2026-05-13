package repeticao;
import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner(System.in);
		int [] num = new int[10];
		int pares = 0, impares = 0;
		
		for (int i = 0; i < 10; i++) {
			System.out.print("Informe o "+(i+1)+"º número: ");
			num[i] = leitor.nextInt();
			
			if (num[i] % 2 == 0)
				pares++;
			else
				impares++;
		}
		
		System.out.printf("%d números pares\n%d números impares", pares, impares);
		leitor.close();
	}

}
