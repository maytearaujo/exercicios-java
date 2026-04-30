package sequencial;

import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner(System.in);
		
		double  area, litros, precoTotal; 
		double precoTotal18, latas18;
		double precoTotal3_6, latas3_6;
		double precoTotallatas18_2, precoTotal3_6_2, latas18_2,  latas3_6_2;
		
		System.out.print("Informe a area a ser pintada (m²): ");
		area = leitor.nextFloat();
		
		litros = area / 6;
		
		latas18 = litros / 18;
		latas18 = Math.ceil(latas18);
		precoTotal18 = latas18 * 80;
		
		latas3_6 = litros / 3.6;
		latas3_6 = Math.ceil(latas3_6);
		precoTotal3_6 = latas3_6 * 25;
		
		latas18_2 = litros / 18;
		latas18_2 = Math.floor(latas18_2);
		precoTotallatas18_2 = latas18_2 *80;
				
		latas3_6_2 = litros % 3.6;
		latas3_6_2 = Math.ceil(latas3_6_2);
		precoTotal3_6_2 = latas3_6_2 * 25;
		
		precoTotal = precoTotallatas18_2 + precoTotal3_6_2;
				
		System.out.printf("Para pintar %.2f m² utilizando latas de 18 litros será necessário utilizar %.0f latas de tintas e custará R$ %.2f %n", area, latas18, precoTotal18);
		
		System.out.printf("Para pintar %.2f m² utilizando latas de 3.6 litros será necessário utilizar %.0f latas de tintas e custará R$ %.2f %n", area, latas3_6, precoTotal3_6);
		  
		System.out.printf("Para pintar %.2f m² utilizando latas de 18 e de 3.6 litros será necessário utilizar %n %.0f latas de 18 litros e %.0f latas de 3.6 litros de tintas e custará R$ %.2f", area, latas18_2, latas3_6_2, precoTotal);

		leitor.close();
	}

}

/*
 * Faça um Programa para uma loja de tintas. O programa deverá pedir o tamanho em metros quadrados da área a ser pintada.
 *  Considere que a cobertura da tinta é de 1 litro para cada 6 metros quadrados 
 *  e que a tinta é vendida em latas de 18 litros, que custam R$ 80,00 
 *  ou em galões de 3,6 litros, que custam R$ 25,00.
Informe ao usuário as quantidades de tinta a serem compradas e os respectivos preços em 3 situações:
comprar apenas latas de 18 litros;
comprar apenas galões de 3,6 litros;
misturar latas e galões, de forma que o desperdício de tinta seja menor. Acrescente 10% de folga e sempre arredonde os valores para cima, isto é, considere latas cheias.
 * */