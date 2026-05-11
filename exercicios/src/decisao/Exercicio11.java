package decisao;
import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner(System.in);
		float salarioAtual, percentualAumento = 0, valorAumento, novoSalario;
		
		System.out.print("Infome o salário atual: ");
		salarioAtual = leitor.nextFloat();
		
		if (salarioAtual >= 0 && salarioAtual <= 280)
			percentualAumento = 0.20f;
		else if (salarioAtual > 280 && salarioAtual <= 700 )
			percentualAumento = 0.15f;
		else if (salarioAtual > 700 && salarioAtual <= 1500)
			percentualAumento = .1f;
		else if (salarioAtual > 1500)
			percentualAumento = .05f;
				
		valorAumento = salarioAtual * percentualAumento;
		novoSalario = salarioAtual + valorAumento;
		
		System.out.printf("o salário antes do reajuste: R$ %.2f\r\n"
				+ "o percentual de aumento aplicado: %.0f%%\r\n"
				+ "o valor do aumento: R$ %.2f\r\n"
				+ "o novo salário: R$ %.2f", salarioAtual, percentualAumento*100, valorAumento, novoSalario);
		leitor.close();
	}

}
/*
 *As Organizações Tabajara resolveram dar um aumento de salário aos seus colaboradores e lhe contraram para desenvolver o programa que calculará os reajustes.
Faça um programa que recebe o salário de um colaborador e o reajuste segundo o seguinte critério, baseado no salário atual:
salários até R$ 280,00 (incluindo) : aumento de 20%
salários entre R$ 280,00 e R$ 700,00 : aumento de 15%
salários entre R$ 700,00 e R$ 1500,00 : aumento de 10%
salários de R$ 1500,00 em diante : aumento de 5% 
Após o aumento ser realizado, informe na tela:
o salário antes do reajuste;
o percentual de aumento aplicado;
o valor do aumento;
o novo salário, após o aumento
 * */
