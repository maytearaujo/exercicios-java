package decisao;
import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner texto = new Scanner(System.in);
		int ano;
		
		System.out.print("Informe um ano: ");
		ano = texto.nextInt();
		
		if (ano % 400 == 0)
			System.out.printf("%d é bissexto", ano);
		else if (ano % 4 == 0 && ano % 100 != 0)
				System.out.printf("%d é bissexto", ano);
		
		else 
			System.out.printf("%d não é bissexto", ano);
	
		
		texto.close();
	}

}
