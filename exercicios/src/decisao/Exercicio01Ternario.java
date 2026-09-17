package decisao;
import java.util.Scanner;

public class Exercicio01Ternario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner(System.in);
		int num1, num2;
		
		System.out.print("Informe o 1º número: ");
		num1 = leitor.nextInt();
		
		System.out.print("Informe o 2º número: ");
		num2 = leitor.nextInt();
		
		System.out.println(
				(num1 > num2) ? 
			"num1 é o maior número." :
		(num2 > num1) ?	"num2 é o maior número"  : "Os números são iguais");
			
		leitor.close();
	}

}
