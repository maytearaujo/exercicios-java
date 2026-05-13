package repeticao;
import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner(System.in);
		int base, expoente, elevado = 1;
		
		System.out.print("Informe a base: ");
		base = leitor.nextInt();
		
		System.out.print("Informe a expoente: ");
		expoente = leitor.nextInt();
		
		for (int i = 1; i <= expoente; i++)
			elevado *= base;
		
		System.out.printf("%d elevado a %d é igual a %d", base, expoente, elevado);
	leitor.close();
	}

}
