package decisao;
import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner(System.in);
		int num;
		
		System.out.print("Informe um número: ");
		num = leitor.nextInt();
		
		if (num > 0)
			System.out.print("Positivo");
		else if (num < 0)
			System.out.print("Negativo");
		else
			System.out.print("Neutro");
		
		leitor.close();
	}

}
