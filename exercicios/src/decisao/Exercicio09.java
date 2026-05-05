package decisao;
import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner(System.in);
		int numero1, numero2, numero3, maior = 0, menor = 0, meio = 0;
		
		System.out.print("Informe o 1º número: ");
		numero1 = leitor.nextInt();
		
		System.out.print("Informe o 2º número: ");
		numero2 = leitor.nextInt();
		
		System.out.print("Informe o 3º número: ");
		numero3 = leitor.nextInt();
		
		if (numero1 == numero2 && numero1 == numero3 && numero2 == numero3)
				System.out.println("Os números são iguais");
		else {
		
			if (numero1 > numero2 && numero1 > numero3) {			
				maior = numero1;
				if (numero2 > numero3) {
					menor = numero3;
					meio = numero2;
				}
				else {
					menor = numero2;
					meio = numero3;
				}
			}
			else if (numero2 > numero1 && numero2 > numero3) {
				maior = numero2;
				if ( numero1 > numero3) {
					menor = numero3;
					meio = numero1;
				} 
				else {
					menor = numero1;
					meio = numero3;
				}
			}
			else if (numero3 > numero1 && numero3 > numero2) {
				maior = numero3;
				if (numero1 > numero2) {
					menor = numero2;
					meio = numero1;
				}
				else {
					menor = numero1;
					meio = numero2;
				}	
			}
			else if (numero1 ==  numero2) {
				if (numero1 > numero3) {
					maior = numero1;
					meio = numero2;
					menor = numero3;
				}
				else {				
					maior = numero3;
					meio = numero2;
					menor = numero1;
				}
			}
			else if (numero1 ==  numero3) {
				if (numero1 > numero2) {
					maior = numero1;
					meio = numero3;
					menor = numero2;
				}
				else {				
					maior = numero2;
					meio = numero3;
					menor = numero1;
				}
			}
			else if (numero2 ==  numero3) {
				if (numero2 > numero1) {
					maior = numero2;
					meio = numero3;
					menor = numero1;
				}
				else {				
					maior = numero1;
					meio = numero3;
					menor = numero2;
				}
			}					
			
			System.out.printf("%d %d %d", maior, meio, menor);
			
			}
		leitor.close();
	}

}
