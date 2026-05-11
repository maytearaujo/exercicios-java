package decisao;
import java.util.Scanner;

public class Exercicio27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner(System.in);
		float pesoMorango, pesoMaca, precoMorango = 0, precoMaca = 0, precoTotalMorango, precoTotalMaca;
		float pesoTotal, precoTotal, descontoPrecoTotal = 0;
		
		System.out.print("Informe o peso (kg) do morango: ");
		pesoMorango = leitor.nextFloat();
		
		System.out.print("Informe o peso (kg) da maça: ");
		pesoMaca = leitor.nextFloat();
		
		if ((pesoMorango >= 0 && pesoMaca >= 0)  && (pesoMorango != 0 || pesoMaca != 0 )) {
		
			if (pesoMorango >= 0 && pesoMorango <= 5)
				precoMorango = 2.5f;
			else if (pesoMorango > 5)
				precoMorango = 2.2f;
			
			if (pesoMaca >= 0 && pesoMaca <= 5)
				precoMaca = 1.8f;
			else if (pesoMaca > 5)
				precoMaca = 1.5f;
			
			precoTotalMorango = precoMorango * pesoMorango;
			precoTotalMaca = precoMaca * pesoMaca;
			
			precoTotal = precoTotalMorango + precoTotalMaca;
			
			pesoTotal = pesoMaca + pesoMorango;
			
			if (pesoTotal > 8 || precoTotal > 25) {
				descontoPrecoTotal = precoTotal * 0.1f;
				precoTotal = precoTotal - descontoPrecoTotal;
			} 
				
			System.out.println("Valor a ser pago: " + precoTotal);
		}
		else
			System.out.println("Peso digitado inválido!");
		leitor.close();

	}

}
