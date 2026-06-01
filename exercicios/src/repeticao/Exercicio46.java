package repeticao;
import java.util.Scanner;
import java.util.ArrayList;

public class Exercicio46 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String nome;		
		ArrayList <Float> saltos = new ArrayList<>(), demaisSaltos = new ArrayList<>();
		float soma = 0, media, maior, menor;

		int posicaoMaior = 0, posicaoMenor = 0;;
		
		do {
			System.out.print("Informe o nome do atleta: ");
			nome = input.nextLine();
			
			if (!nome.isEmpty()) { 
			
				for (int i = 0; i < 5; i++) {
					System.out.print("Informe o " + (i+1) + "º salto: ");
					saltos.add(input.nextFloat());
				}
				
				input.nextLine();
				maior = saltos.get(0);
				menor = saltos.get(0);
				
				for (int i = 1; i < saltos.size(); i++) {
					if (saltos.get(i) > maior) {
						maior = saltos.get(i);
						posicaoMaior = i;
					}
					
					if (saltos.get(i) < menor) {
						menor = saltos.get(i);
						posicaoMenor = i;
					}
					
				}
				
				for (int i = 0; i < saltos.size(); i++) {
					if (i != posicaoMenor && i!= posicaoMaior) {					
						demaisSaltos.add(saltos.get(i));
					}
				}
				
				for (float salto : demaisSaltos) {
					soma += salto;
				}
				
				media = soma / demaisSaltos.size();
				
				System.out.printf(
						"\nMelhor salto:  %.1f\n"
						+ "Pior salto: %.1f\n"
						+ "Média dos demais saltos: %.1f", maior, menor, media);
				
				System.out.printf("\n\nResultado final:\n"
						+ "%s: %.1f", nome, media);
				;
				saltos.clear();
				demaisSaltos.clear();
				soma = 0;
				media = 0;
				posicaoMaior = 0;
				posicaoMenor = 0;
				System.out.println("");
			} else
				System.out.println("Programa Finalizado!!");
			
		} while (!nome.isEmpty());
		
		input.close();
	}

}
/*
Em uma competição de salto em distância cada atleta tem direito a cinco saltos. 
No final da série de saltos de cada atleta, o melhor e o pior resultados são eliminados. 
O seu resultado fica sendo a média dos três valores restantes. Você deve fazer um programa que receba 
o nome e as cinco distâncias alcançadas pelo atleta em seus saltos e depois informe a média dos saltos
 conforme a descrição acima informada (retirar o melhor e o pior salto e depois calcular a média). 
 Faça uso de uma lista para armazenar os saltos. Os saltos são informados na ordem da execução, 
 portanto não são ordenados. O programa deve ser encerrado quando não for informado o nome do 
 atleta. A saída do programa deve ser conforme o exemplo abaixo:
 
Atleta: Rodrigo Curvêllo

Primeiro Salto: 6.5 m
Segundo Salto: 6.1 m
Terceiro Salto: 6.2 m
Quarto Salto: 5.4 m
Quinto Salto: 5.3 m

Melhor salto:  6.5 m
Pior salto: 5.3 m
Média dos demais saltos: 5.9 m

Resultado final:
Rodrigo Curvêllo: 5.9 m

*/