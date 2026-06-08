package listas;
import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner(System.in);
		double vendaBruta, salario;
		int qtdVendedores, count = 0, indice;
		double [] salarios;
		int[] contadoresFaixas = new int[9];
		int inicio, fim;
		
		System.out.print("Informe a quantidade de vendedores: ");
		qtdVendedores = leitor.nextInt();
		
		salarios = new double [qtdVendedores];
		
		do {
			
			System.out.print("Informe o valor da venda bruta: ");
			vendaBruta = leitor.nextDouble();
			
			if (vendaBruta >= 0 ) {
			
				salario = ((vendaBruta * 9) / 100) + 200;
				System.out.print("Salário: " + salario + "\n\n");
				
				salarios[count] = salario;
				count++;
			}
			
		} while ( count != qtdVendedores);
		
		for (int i = 0; i < salarios.length; i++) {
			indice = (int) (salarios[i] - 200) / 100;
			
			if (indice > 8)
				indice = 8;
			
			contadoresFaixas[indice] ++;
		}
		
		for (int i = 0; i < contadoresFaixas.length; i++) {			
			if (i < 8 ) {
				inicio=200+(i * 100);
				fim=inicio+99;
				System.out.println(contadoresFaixas[i] + " vendedores receberam entre $"
						 + inicio + " - $" + fim);
			}
			 else {
			        System.out.println(
			            contadoresFaixas[i] +
			            " vendedores receberam $1000 em diante"
			        );
			    }	
			
			
			
		}
		
		leitor.close();

	}

}
/*
Utilize uma lista para resolver o problema a seguir. Uma empresa paga seus vendedores com base em comissões.
O vendedor recebe $200 por semana mais 9 por cento de suas vendas brutas daquela semana. Por exemplo, 
um vendedor que teve vendas brutas de $3000 em uma semana recebe $200 mais 9 por cento de $3000, ou seja, 
um total de $470. Escreva um programa (usando um array de contadores) que determine quantos vendedores 
receberam salários nos seguintes intervalos de valores:
$200 - $299
$300 - $399
$400 - $499
$500 - $599
$600 - $699
$700 - $799
$800 - $899
$900 - $999
$1000 em diante

Desafio: Crie ma fórmula para chegar na posição da lista a partir do salário, sem fazer vários ifs aninhados.


*/