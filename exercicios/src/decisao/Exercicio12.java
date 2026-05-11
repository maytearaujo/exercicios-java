package decisao;
import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner(System.in);
		float valorHora, horasTrabalhadas, salarioBruto, impostoRenda = 0, inss, fgts, descontos, salarioLiquido, sindicato;
		
		System.out.print("Informe o valor da hora: ");
		valorHora = leitor.nextFloat();
		
		System.out.print("Informe a quantidade de horas: ");
		horasTrabalhadas = leitor.nextFloat();
		
		salarioBruto = valorHora * horasTrabalhadas ;
		
		if (salarioBruto > 0 && salarioBruto <= 900)
			impostoRenda = 0;
		else if (salarioBruto > 900 && salarioBruto <= 1500)
			impostoRenda = salarioBruto * .05f;
		else if (salarioBruto > 1500 && salarioBruto <= 2500)
			impostoRenda = salarioBruto * .10f;
		else if (salarioBruto > 2500)
			impostoRenda = salarioBruto * .20f;
			
		inss =  salarioBruto * 0.1f;
		fgts = salarioBruto * 0.11f;
		sindicato = salarioBruto * 0.3f;
		descontos = inss + impostoRenda;
		salarioLiquido = salarioBruto - descontos;
		
		System.out.printf(""
				+ "        Salário Bruto: (5 * 220)        : R$ %.2f\n"
				+ "        (-) IR (5%%)                     : R$ %.2f\n"
				+ "        (-) INSS ( 10%%)                 : R$ %.2f\n"
				+ "        FGTS (11%%)                      : R$ %.2f\n"
				+ "        Total de descontos              : R$ %.2f\n"
				+ "        Salário Liquido                 : R$ %.2f"
				+ "        Sindicato                       : R$ %.2f", salarioBruto, impostoRenda, inss, fgts, descontos, salarioLiquido, sindicato);
	leitor.close();
	}

}
/*
 Faça um programa para o cálculo de uma folha de pagamento, sabendo que os descontos são do Imposto de Renda, 
 que depende do salário bruto (conforme tabela abaixo) e 3% para o Sindicato e que o FGTS corresponde a 11% do Salário Bruto,
  mas não é descontado (é a empresa que deposita). O Salário Líquido corresponde ao Salário Bruto menos os descontos. 
  O programa deverá pedir ao usuário o valor da sua hora e a quantidade de horas trabalhadas no mês.
Desconto do IR:
Salário Bruto até 900 (inclusive) - isento
Salário Bruto até 1500 (inclusive) - desconto de 5%
Salário Bruto até 2500 (inclusive) - desconto de 10%
Salário Bruto acima de 2500 - desconto de 20% 
Imprima na tela as informações, dispostas conforme o exemplo abaixo. No exemplo o valor da hora é 5 e a quantidade de hora é 220.
        Salário Bruto: (5 * 220)        : R$ 1100,00
        (-) IR (5%)                     : R$   55,00  
        (-) INSS ( 10%)                 : R$  110,00
        FGTS (11%)                      : R$  121,00
        Total de descontos              : R$  165,00
        Salário Liquido                 : R$  935,00
 */