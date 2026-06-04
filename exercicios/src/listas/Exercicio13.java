package listas;
import java.util.Scanner;
import java.util.ArrayList;

public class Exercicio13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String [] meses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
		ArrayList <Float> temperaturas = new ArrayList <>();
		float mediaAnual, soma = 0;
	
		for (int i = 0; i < 12; i++) {
			System.out.print("Informe a temperatura média de " + meses[i] + ": ");
			temperaturas.add(input.nextFloat());
		}
		
		for ( float temp: temperaturas) {
			soma += temp;
		}
		
		mediaAnual = soma / temperaturas.size();
		
		System.out.printf("\nMédia Anual: %.1f\nTemperaturas acima da média anual: \n", mediaAnual );
		
		for (int i = 0; i < meses.length; i++) {
			if (temperaturas.get(i) > mediaAnual)
				System.out.printf("%-2d - %-10s: %2.0f\n", i+1, meses[i], temperaturas.get(i));
		}
		
		input.close();
	}

}

/*
Faça um programa que receba a temperatura média de cada mês do ano e armazene-as em uma lista. Após isto, calcule a média anual das temperaturas e mostre todas as temperaturas acima da média anual, e em que mês elas ocorreram (mostrar o mês por extenso: 1 – Janeiro, 2 – Fevereiro, . . . ).
*/