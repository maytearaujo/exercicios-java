package sequencial;
import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner(System.in);
		float valorHora, horasTrabalhadas, ir, inss, sindicato, salarioLiquido, salarioBruto;
		
		System.out.print("Informe o valor da hora trabalhada: ");
		valorHora = leitor.nextFloat();
		
		System.out.print("Informe a quantidade de horas trabalhadas: ");
		horasTrabalhadas = leitor.nextFloat();
		
		salarioBruto = valorHora * horasTrabalhadas;
		
		ir = (salarioBruto * 11) / 100;
		inss = (salarioBruto * 8) / 100;
		sindicato = (salarioBruto * 5) / 100;
		
		salarioLiquido = salarioBruto - (ir + inss + sindicato);
		
		System.out.printf(
				"+ Salário Bruto : R$ %.2f %n"
				+ "- IR (11%%) : R$ %.2f %n"
				+ "- INSS (8%%) : R$ %.2f %n"
				+ "- Sindicato (5%%) : R$ %.2f %n"
				+ "= Salário Liquido : R$ %.2f%n", 
				salarioBruto, ir, inss, sindicato, salarioLiquido);
		
		leitor.close();
	}

}
/*
 Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês.
  Calcule e mostre o total do seu salário no referido mês, sabendo-se que são descontados 11% para o Imposto de Renda, 8% para o INSS e 5% para o sindicato,
   faça um programa que nos dê:
salário bruto.
quanto pagou ao INSS.
quanto pagou ao sindicato.
o salário líquido.
calcule os descontos e o salário líquido, conforme a tabela abaixo:
+ Salário Bruto : R$
- IR (11%) : R$
- INSS (8%) : R$
- Sindicato ( 5%) : R$
= Salário Liquido : R$
Obs.: Salário Bruto - Descontos = Salário Líquido.
 */