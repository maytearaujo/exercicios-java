package funcoes;
import java.util.Scanner;

public class Exercicio05 {

	public static double somaImposto(double taxaImposto, double custo) {
	
		taxaImposto /= 100;
	
		custo = (custo * taxaImposto) + custo;
		
		return custo;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner(System.in);
		double taxaImposto, custo, custoFinal; 
		
		System.out.print("Informe a porcetagem do imposto (%): ");
		taxaImposto = leitor.nextDouble();
		
		System.out.print("Informe o custo: ");
		custo = leitor.nextDouble();
		
		custoFinal = somaImposto(taxaImposto, custo);
		System.out.println("Custo final: " + custoFinal);
		leitor.close();
	}

}

/*
Faça um programa com uma função chamada somaImposto. A função possui dois parâmetros formais: taxaImposto, que é a quantia de imposto sobre vendas expressa em porcentagem e custo, que é o custo de um item antes do imposto. A função “altera” o valor de custo para incluir o imposto sobre vendas.
*/