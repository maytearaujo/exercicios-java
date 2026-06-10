package listas;
import java.util.Scanner;
import java.util.ArrayList;

public class Exercicio20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leitor = new Scanner(System.in);
		double salario, totalAbonos = 0, maiorAbono = 0, abono;
		int qtdMinimos = 0;
		
		ArrayList <Double> salarios = new ArrayList<>();
		ArrayList <Double> abonos = new ArrayList<>();
		
		do {
			
			System.out.print("Informe o salário: ");
			salario = leitor.nextDouble();
						
			if (salario < 0)
				System.out.println("Salário Inválido!");
			else if (salario > 0) {
				salarios.add(salario);
			}
			
		} while (salario != 0);
		
		if (salarios.isEmpty())
			System.out.println("Programa Finalizado!");
		else {
			for (int i = 0; i < salarios.size(); i++) {
				abono = salarios.get(i) * 0.2;
				
				if (abono <= 100) {
					abonos.add(100.0);
					qtdMinimos++;
				}
				else
					abonos.add(abono);
				
				if (abonos.get(i) > maiorAbono)
					maiorAbono = abonos.get(i);
				
				totalAbonos+= abonos.get(i);

			}
			
			System.out.printf("\n%-12s %-3s %10s", "Salário", " - ", "Abono");
			
			for (int i = 0; i < salarios.size(); i++) {
				System.out.printf("\n%-3s %-8.2f %3s %-3s %-8.2f", "R$ ", 
						salarios.get(i), " - ", "R$ ", abonos.get(i));
			}
			
			System.out.printf("\n\nForam processados %d colaboradores", salarios.size());
			System.out.printf("\nTotal gasto com abonos: %.2f", totalAbonos);
			System.out.printf("\nValor mínimo pago a %d colaboradores", qtdMinimos);
			System.out.printf("\nMaior valor de abono pago: %.2f", maiorAbono);
		}
		
		
		leitor.close();
	}

}
/*
As Organizações Tabajara resolveram dar um abono aos seus colaboradores em reconhecimento ao bom resultado alcançado durante o ano que passou. 
Para isto contratou você para desenvolver a aplicação que servirá como uma projeção de quanto será gasto com o pagamento deste abono.
Após reuniões envolvendo a diretoria executiva, a diretoria financeira e os representantes do sindicato laboral, chegou-se a seguinte forma de cálculo:

a.Cada funcionário receberá o equivalente a 20% do seu salário bruto de dezembro; 
b.O piso do abono será de 100 reais, isto é, aqueles funcionários cujo salário for muito baixo, recebem este valor mínimo; 
Neste momento, não se deve ter nenhuma preocupação com colaboradores com tempo menor de casa, descontos, impostos ou outras particularidades. 

Seu programa deverá permitir a digitação do salário de um número indefinido (desconhecido) de salários. 
Um valor de salário igual a 0 (zero) encerra a digitação. Após a entrada de todos os dados o programa deverá calcular o valor 
do abono concedido a cada colaborador, de acordo com a regra definida acima. 
Ao final, o programa deverá apresentar:

O salário de cada funcionário, juntamente com o valor do abono;
O número total de funcionário processados;
O valor total a ser gasto com o pagamento do abono;
O número de funcionário que receberá o valor mínimo de 100 reais;
O maior valor pago como abono; 
A tela abaixo é um exemplo de execução do programa, apenas para fins ilustrativos. Os valores podem mudar a cada execução do programa.
Projeção de Gastos com Abono
============================ 
 
Salário: 1000
Salário: 300
Salário: 500
Salário: 100
Salário: 4500
Salário: 0
 
Salário    - Abono     
R$ 1000.00 - R$  200.00
R$  300.00 - R$  100.00
R$  500.00 - R$  100.00
R$  100.00 - R$  100.00
R$ 4500.00 - R$  900.00
 
Foram processados 5 colaboradores
Total gasto com abonos: R$ 1400.00
Valor mínimo pago a 3 colaboradores
Maior valor de abono pago: R$ 900.00
*/