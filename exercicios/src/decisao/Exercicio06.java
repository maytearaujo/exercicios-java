package decisao;
import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		int numero1, numero2, numero3;
		
		
		System.out.print("Digite o 1º número: ");
		numero1 = ler.nextInt();
		
		System.out.print("Digite o 2º número: ");
		numero2 = ler.nextInt();
		
		System.out.print("Digite o 3º número: ");
		numero3 = ler.nextInt();
		
		if (numero1 == numero2 && numero1 == numero3 && numero2 == numero3)
			System.out.print("Os números são iguais");
		else if (numero1 != numero2 && numero1 != numero3 && numero2 != numero3) {			
			if (numero1 > numero2 && numero1 > numero3)
				System.out.printf("%d é o maior número", numero1);
			
			else if (numero2 > numero1 && numero2 > numero3)
				System.out.printf("%d é o maior número", numero2);	
			
			else if (numero3 > numero1 && numero3 > numero2) 
				System.out.printf("%d  é o maior número", numero3);			
		}
		else if (numero1 == numero2) {
			if( numero3 > numero1)
				System.out.printf("%d  é o maior número", numero3);		
			else
				System.out.printf("%d  é o maior número", numero1);
		}
		
		else if (numero1 == numero3) {  
			if (numero2 > numero1)
				System.out.printf("%d  é o maior número", numero2);	
			else
				System.out.printf("%d  é o maior número", numero1);
		}
		else if (numero2 == numero3) {
			if (numero1 > numero2)
				System.out.printf("%d  é o maior número", numero1);	
			else
				System.out.printf("%d  é o maior número", numero2);	
		}

	}

}
