package decisao;
import java.util.Scanner;

public class Exercicio26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner(System.in);
		char fuelType;
		float litros, desconto = 0, preco = 0, precoLitro = 0, valorFinal, valorDesconto;
		boolean invalidFuelType = false;
		
		System.out.print("Informe o número de litros vendidos: ");
		litros = leitor.nextFloat();
		
		System.out.print("Informe o tipo de combustível: \n A-álcool, G-gasolina\n");
		fuelType = leitor.next().charAt(0);
		fuelType = Character.toUpperCase(fuelType);
		
		switch (fuelType) { 
			case 'A': 
				preco = 1.9f; 
				if (litros > 0 && litros <= 20) 
					desconto = .03f; 
				else desconto = .05f; 
				break; 
			case 'G': 
				preco = 2.5f; 
				if (litros > 0 && litros <= 20) 
					desconto = .04f; 
				else desconto = .06f; 
				break; 
			default:
				invalidFuelType = true;
				break;
		}
		
		if (invalidFuelType || litros <= 0)
			System.out.println("Tipo de combustível ou quantidade de litros inválido");
		else
		{
			precoLitro = litros * preco;
			valorDesconto = precoLitro * desconto;
			valorFinal = precoLitro - valorDesconto;
			System.out.println("Valor a ser pago: " + valorFinal);
		}
					
		leitor.close();
	}

}
/*
 * Um posto está vendendo combustíveis com a seguinte tabela de descontos:
Álcool:
até 20 litros, desconto de 3% por litro
acima de 20 litros, desconto de 5% por litro

Gasolina:
até 20 litros, desconto de 4% por litro
acima de 20 litros, desconto de 6% por litro 
Escreva um algoritmo que leia o número de litros vendidos, o tipo de combustível (codificado da seguinte forma: A-álcool, G-gasolina), 
calcule e imprima o valor a ser pago pelo cliente sabendo-se que o preço do litro da gasolina é R$ 2,50 o preço do litro do álcool é R$ 1,90.
 */