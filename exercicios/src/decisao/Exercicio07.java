package decisao;
import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		int numero1, numero2, numero3, maior=0, menor=0;
		
		
		System.out.print("Digite o 1º número: ");
		numero1 = ler.nextInt();
		
		System.out.print("Digite o 2º número: ");
		numero2 = ler.nextInt();
		
		System.out.print("Digite o 3º número: ");
		numero3 = ler.nextInt();
		
		if (numero1 == numero2 && numero1 == numero3 && numero2 == numero3)
			System.out.print("Os números são iguais");
		else {
		
			if (numero1 != numero2 && numero1 != numero3 && numero2 != numero3) {			
				if (numero1 > numero2 && numero1 > numero3)
					maior = numero1;
				else if (numero2 > numero1 && numero2 > numero3)
					maior = numero2;
				else if(numero3 > numero1 && numero3 > numero2)
					maior = numero3;
				
				if (numero1 < numero2 && numero1 < numero3)
					menor = numero1;
				else if (numero2 < numero1 && numero2 < numero3)
					menor = numero2;
				else if(numero3 < numero1 && numero3 < numero2)
					menor = numero3;
			}
			
			else if (numero1 == numero2) {
				if (numero1 > numero3) 
					maior = numero1;
				else
					maior = numero3;
				
				if (numero1 < numero3)
					menor = numero1;
				else
					menor =  numero3;
			}
			
			else if (numero1 == numero3) {
				if (numero1 > numero2)
					maior = numero1;
				else
					maior = numero2;
				
				if (numero1 < numero2)
					menor = numero1;
				else
					menor = numero2;
			}
			
			else if (numero2 == numero3) {
				if (numero2 > numero1)
					maior = numero2;
				else
					maior = numero1;
				
				if (numero2 < numero1)
					menor = numero2;
				else
					menor = numero1;
			}
				
			System.out.printf("%d é o maior número e %d é o menor", maior, menor);
		}
		
		ler.close();
	}
	

}
