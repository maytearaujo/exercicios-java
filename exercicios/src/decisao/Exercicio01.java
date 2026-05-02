package decisao;
import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner(System.in);
		int num1, num2;
		
		System.out.print("Informe o 1º número: ");
		num1 = leitor.nextInt();
		
		System.out.print("Informe o 2º número: ");
		num2 = leitor.nextInt();
		
		if (num1 > num2)
			System.out.printf("%d é o maior número.", num1);
		else if (num2 > num1)			
			System.out.printf("%d é o maior número", num2);
		else
			System.out.print("Os números são iguais");
			
		leitor.close();
	}

}
