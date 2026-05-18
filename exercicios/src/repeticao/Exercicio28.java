package repeticao;
import java.util.Scanner;

public class Exercicio28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner(System.in);
		int quantidadeCd;
		float precoCd, valorTotal = 0, valorMedio;

		do {
			System.out.print("Informe a quantidade de cd's: ");
			quantidadeCd = leitor.nextInt();
		} while (quantidadeCd <= 0);
		
		for (int i = 1; i <= quantidadeCd; i++) {
			do {
				System.out.print("Informe o preço do " + i + "º CD: ");
				precoCd = leitor.nextFloat();
			} while (precoCd <= 0);
			
			valorTotal += precoCd;
		}
			valorMedio = valorTotal / quantidadeCd;
			
			System.out.println("Valor total investido: " + valorTotal + "\nValor Médio: " + valorMedio);
		
		leitor.close();
	}

}

/*
Faça um programa que calcule o valor total investido por um colecionador em sua coleção de CDs e o valor médio gasto em cada um deles. 
O usuário deverá informar a quantidade de CDs e o valor para em cada um.
*/