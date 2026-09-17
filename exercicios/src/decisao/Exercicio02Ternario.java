package decisao;
import java.util.Scanner;

public class Exercicio02Ternario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner(System.in);
		int num;
		String situacao;
		
		System.out.print("Informe um número: ");
		num = leitor.nextInt();
		
		situacao = (num > 0) ? "Positivo" :	(num < 0) ? "Negativo" : "Neutro";
		System.out.println(situacao);
		
		leitor.close();
	}

}
