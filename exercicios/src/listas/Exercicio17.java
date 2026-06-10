package listas;
import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		String nome;
		double [] salto = new double[5];
		double maior, temp, soma = 0, media;
		String [] numerosOrdinais = {
				"Primeiro",
				"Segundo",
				"Terceiro",
				"Quarto",
				"Quinto"
		};
		
		do {
			
			System.out.print("Informe o nome do atleta: ");
			nome = input.nextLine();
			
			if (!nome.isEmpty()) {
			
				for (int i = 0; i < salto.length; i++) {
				System.out.print("Informe a distância do " + (i+1) + "º salto: ");
				salto[i] = input.nextDouble();
			}
					
				input.nextLine();
			
				maior = salto[0];
				
				for (int i = 1; i < salto.length; i++) {
					if (salto[i] > maior ) {
						temp = salto[i];				
						salto[i] = maior;
						maior =  temp;
					}
				}
				
				for (int i = 1; i < salto.length -1; i++) {
					soma += salto[i];
				}
				
				media = soma / (salto.length - 2);
				
				System.out.println("\n");
				
				for (int i = 0; i < salto.length; i++) {
					System.out.printf("%s Salto: %.1f m\n", numerosOrdinais[i], salto[i]);
				}
				
				System.out.println("\nResultado final: ");
				System.out.printf("Atleta: %s", nome);
				System.out.print("\nSaltos: ");
				
				for ( int i = 0; i < salto.length; i++) {
					System.out.print(salto[i]);
					
					if (i < salto.length - 1)
						System.out.print(" - ");
				}
				
				System.out.printf("\nMédia dos saltos: %.1f m   ", media);
				System.out.println("\n");
			} else
				System.out.print("Programa Finalizado!");
			
		} while (!nome.isEmpty());


		input.close();
	}

}

/*

Em uma competição de salto em distância cada atleta tem direito a cinco saltos. O resultado do atleta será determinado
No final da série de saltos de cada atleta, o melhor e o pior resultados são eliminados. O seu resultado fica sendo a 
média dos três valores restantes.  Você deve fazer um programa que receba o nome e as cinco distâncias alcançadas pelo 
atleta em seus saltos e depois informe o nome, os saltos e a média dos saltos. O programa deve ser encerrado quando não 
for informado o nome do atleta. A saída do programa deve ser conforme o exemplo abaixo:
Atleta: Rodrigo Curvêllo
 
Primeiro Salto: 6.5 m
Segundo Salto: 6.1 m
Terceiro Salto: 6.2 m
Quarto Salto: 5.4 m
Quinto Salto: 5.3 m

Resultado final:
Atleta: Rodrigo Curvêllo
Saltos: 6.5 - 6.1 - 6.2 - 5.4 - 5.3
Média dos saltos: 5.9 m

*/