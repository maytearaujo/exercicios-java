package exercicio08;

import java.util.Scanner;

public class CalculoSalario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner(System.in);
		float valorHoraTrabalhada, qtdHorasTrabalhadas, salarioMensal;
		
		System.out.println("Informe o valor da hora trabalhada");
		valorHoraTrabalhada = leitor.nextFloat();
		
		System.out.println("Informe o número de horas trabalhadas no mês");
		qtdHorasTrabalhadas = leitor.nextFloat();
		
		salarioMensal = qtdHorasTrabalhadas * valorHoraTrabalhada;
		System.out.printf("Salário Mensal: %.2f", salarioMensal);

	}

}
