package decisao;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner(System.in);
		int diaSemana = 0;
		
		System.out.print("Informe um número entre 1 e 7: ");
		diaSemana = leitor.nextInt();
		
		switch (diaSemana) {
		case 1: 
			System.out.println("1 - Domingo");
			break;
		case 2:
			System.out.println("2 - Segunda");
			break;
		case 3:
			System.out.println("3 - Terça");
			break;
		case 4:
			System.out.println("4 - Quarta");
			break;
		case 5:
			System.out.println("5 - Quinta");
			break;
		case 6:
			System.out.println("6 - Sexta");
			break;
		case 7:
			System.out.println("7 - Sábado");
			break;
		default:
			System.out.println("Valor Inválido");
			break;
		}
		
		leitor.close();
	}

}
