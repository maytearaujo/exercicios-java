package repeticao;
import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner(System.in);
		int maior = 0;
		
		int [] numeros = new int[5];
		
		for (int i = 0; i < 5; i++) {
			System.out.printf("Informe o %dº elemento: ", i+1);
			numeros[i] = leitor.nextInt();
		}
		
			maior = numeros[0];
			for (int i = 1; i < numeros.length; i++) {
				if (numeros[i] > maior)
					maior = numeros[i];				
			}
		
			System.out.println(maior);
		
		leitor.close();
	}

}
