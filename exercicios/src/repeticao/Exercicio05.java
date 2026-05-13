package repeticao;
import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner(System.in);
		
		float populacaoA, populacaoB, taxaA = 0, taxaB = 0;
		int anos = 0;
		
		do {
			
			System.out.print("Informe a população do país A: ");
			populacaoA = leitor.nextFloat();
			
			if (populacaoA <= 0)
				System.out.print("Verifique o valor digitado para o país A");
		} while(populacaoA <= 0);
		
		do {
			
			System.out.print("Informe a população do país B: ");
			populacaoB = leitor.nextFloat();
			
			if (populacaoB <= 0 && populacaoB <= populacaoA)
				System.out.print("Verifique o valor digitado para o país B");
		} while(populacaoB <= 0 || populacaoB <= populacaoA);
		
		do {
			System.out.print("Informe a taxa de crescimento de A: ");
			taxaA = leitor.nextFloat(); 
			if (taxaA < 0)
				System.out.println("Verifique a taxa de crescimento digitada.\n");
		} while(taxaA < 0);
		
		do {
			System.out.print("Informe a taxa de crescimento de B: ");
			taxaB = leitor.nextFloat(); 
			if (taxaB < 0)
				System.out.println("Verifique a taxa de crescimento digitada.\n");
		} while(taxaB < 0);
		

		taxaA = taxaA / 100;
		taxaB = taxaB / 100;

		while (populacaoA < populacaoB) {
			anos++;
			populacaoA = populacaoA + (populacaoA * taxaA);
			populacaoB += populacaoB * taxaB;
			
		}
		System.out.printf("Em %d anos população de A iguala ou ultrapassa a população de B", anos);
		
		leitor.close();
	}

}
