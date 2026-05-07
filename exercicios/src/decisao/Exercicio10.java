package decisao;
import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner(System.in);
		char turno;
		
		
		System.out.print("Informe o turno que você estuda:/n em que turno você estuda:\n M-matutino ou V-Vespertino ou N- Noturno ");
		turno = leitor.next().charAt(0);
		turno = Character.toUpperCase(turno);
		
		switch (turno) {
			case 'M':
				System.out.println("Bom dia!");
				break;
				
			case 'V':
				System.out.println("Boa tarde!");
				break;
				
			case 'N':
				System.out.println("Boa Noite!");
				break;
			
			default:
				System.out.println("Valor Inválido!");
				break;
		}
	}

}
