package listas;
import java.util.Scanner; 

public class Exercicio21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leitor = new Scanner(System.in);
		String [] modeloCarros = new String[5];
		double litros1000km, custo1000km;
		double [][] custo = new double[5][3];
		double maisEconomico;
		int idMaisEconomico = 0;
		
		final int KM = 0, KM_LITROS = 1, PRECO = 2; 
		
		for (int i = 0; i < custo.length; i++) {
			System.out.println("Veículo" + (i + 1));
			System.out.print("Nome: ");
			modeloCarros[i] = leitor.nextLine();
			
			System.out.print("Km por litro: ");
			custo[i][KM] = leitor.nextDouble();
			leitor.nextLine();
			
		}
		
		for (int i = 0; i < custo.length; i++) {

			litros1000km = 1000 / custo[i][KM];
			custo1000km = litros1000km * 2.25;
			
			custo[i][KM_LITROS] = litros1000km;
			custo[i][PRECO] = custo1000km;
								
		}
		
		maisEconomico = custo[0][PRECO];
		
		for(int i = 1; i < custo.length; i++) {
			
			if (custo[i][PRECO] < maisEconomico) {
				maisEconomico = custo[i][PRECO];
				idMaisEconomico = i;
			}
		}
		
		System.out.println("\nRelatório Final");
		for (int i = 0; i < custo.length; i++) {
			System.out.printf(
					"%-2d %-3s "
					+ "%-15s %-3s "
					+ "%5.1f %-3s "
					+ "%.1f %-3s "
					+ "%.1f\n", 
					(i+1), " - ", 
					modeloCarros [i], " - ", 
					custo[i][KM], " - ",
					custo[i][KM_LITROS]," litros - ", 
					custo[i][PRECO]
					);	
		}
		System.out.println("O menor consumo é do " + modeloCarros[idMaisEconomico]);
		
		leitor.close();
	}
}

/*
Faça um programa que carregue uma lista com os modelos de cinco carros (exemplo de modelos: FUSCA, GOL, VECTRA etc). 
Carregue uma outra lista com o consumo desses carros, isto é, quantos quilômetros cada um desses carros faz com um 
litro de combustível. Calcule e mostre:
O modelo do carro mais econômico;
Quantos litros de combustível cada um dos carros cadastrados consome para percorrer uma distância de 1000 quilômetros 
e quanto isto custará, considerando um que a gasolina custe R$ 2,25 o litro. Abaixo segue uma tela de exemplo. 
O disposição das informações deve ser o mais próxima possível ao exemplo. Os dados são fictícios e podem mudar a cada execução do programa.
Comparativo de Consumo de Combustível

Veículo 1
Nome: fusca
Km por litro: 7
Veículo 2
Nome: gol
Km por litro: 10
Veículo 3
Nome: uno
Km por litro: 12.5
Veículo 4
Nome: Vectra
Km por litro: 9
Veículo 5
Nome: Peugeout
Km por litro: 14.5

Relatório Final
 1 - fusca           -    7.0 -  142.9 litros - R$ 321.43
 2 - gol             -   10.0 -  100.0 litros - R$ 225.00
 3 - uno             -   12.5 -   80.0 litros - R$ 180.00
 4 - vectra          -    9.0 -  111.1 litros - R$ 250.00
 5 - peugeout        -   14.5 -   69.0 litros - R$ 155.17
O menor consumo é do peugeout.
*/