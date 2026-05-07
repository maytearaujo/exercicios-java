package decisao;
import java.util.Scanner;

public class Exercicio09v01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner(System.in);
		int numero1, numero2, numero3, maior, menor, meio=0;
		
		System.out.print("Informe o 1º número: ");
		numero1 = leitor.nextInt();
		
		System.out.print("Informe o 2º número: ");
		numero2 = leitor.nextInt();
		
		System.out.print("Informe o 3º número: ");
		numero3 = leitor.nextInt();
		
		
		maior = numero1;
		menor = numero1;
		
		if (numero2 > maior) 			
			maior = numero2;
		
		
		if (numero3 > maior)
			maior = numero3;
		
		if (numero2 < menor)
			menor = numero2;
		
		if (numero3 < menor)
			menor = numero3;
		
		if (numero1 != maior && numero1 != menor)
			meio = numero1;
		
		else if (numero2 != maior && numero2 != menor)
			meio = numero2;
		
		else if (numero3 != maior && numero3 != menor)
			meio = numero3;
		else
			meio = maior;
		
		System.out.printf("%d %d %d", maior, meio, menor);
			
			
		leitor.close();
	}

}
