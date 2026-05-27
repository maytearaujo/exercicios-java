package repeticao;
import java.util.Scanner;

public class Exercicio40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] acidentesTransito = new int [5][3];
		Scanner leitor = new Scanner(System.in);
		final int CD_CIDADE = 0, N_VEICULOS = 1, N_ACIDENTES = 2;
		int maiorAcidente, menorAcidente, registroAtual, quantidadeCidadesMenos2000 = 0;
		int indiceMaiorAcidente, indiceMenorAcidente;
		float mediaVeiculos, mediaAcidentes = 0, somaVeiculos = 0, somaAcidentes = 0 ;
		
		for (int i = 0; i < acidentesTransito.length; i++) {
			System.out.print("Informe o código da cidade: ");
			acidentesTransito[i][CD_CIDADE] = leitor.nextInt();
			
			System.out.print("Informe o número de veículos de passeio (em 1999): ");
			acidentesTransito[i][N_VEICULOS] = leitor.nextInt();
			
			System.out.print("informe o número de acidentes de trânsito com vítimas (em 1999): ");
			acidentesTransito[i][N_ACIDENTES] = leitor.nextInt();
			
			System.out.println("");
		}
		
		maiorAcidente = acidentesTransito[0][N_ACIDENTES];
		menorAcidente = acidentesTransito[0][N_ACIDENTES];
		indiceMaiorAcidente = 0;
		indiceMenorAcidente = 0;
		
		for (int i = 1; i < acidentesTransito.length; i++) {
			registroAtual = acidentesTransito[i][N_ACIDENTES];
			
			if (registroAtual > maiorAcidente) {
				maiorAcidente = registroAtual;
				indiceMaiorAcidente = i;
			}
			
			if (registroAtual < menorAcidente) {
				menorAcidente = registroAtual;
				indiceMenorAcidente = i;
			}
			
		}

		for (int i = 0; i < acidentesTransito.length; i++) {
			somaVeiculos += acidentesTransito[i][N_VEICULOS]; 

			if (acidentesTransito[i][N_VEICULOS] < 2000) {
				somaAcidentes += acidentesTransito[i][N_ACIDENTES];
				quantidadeCidadesMenos2000++;
			}
		}
				
		mediaVeiculos = somaVeiculos / acidentesTransito.length;
		
		if (quantidadeCidadesMenos2000 > 0) {
			mediaAcidentes = somaAcidentes / quantidadeCidadesMenos2000;
		}
		
		System.out.printf("Maior índice de acidentes: %d Código da cidade: %d\n", maiorAcidente, acidentesTransito[indiceMaiorAcidente][CD_CIDADE]);
		System.out.printf("Menor índice de acidentes: %d Código da cidade: %d\n", menorAcidente, acidentesTransito[indiceMenorAcidente][CD_CIDADE]);
		System.out.printf("Média de veículos nas cinco cidades juntas %.2f\n", mediaVeiculos);
		System.out.printf("Média de acidentes nas cidades com menos de 2.000 veículos de passeio: %.2f\n", mediaAcidentes);
		
		leitor.close();
	}

}
/*
 Foi feita uma estatística em cinco cidades brasileiras para coletar dados sobre acidentes de trânsito. Foram obtidos os seguinte dados:
Código da cidade;
Número de veículos de passeio (em 1999);
Número de acidentes de trânsito com vítimas (em 1999). Deseja-se saber:
Qual o maior e menor índice de acidentes de transito e a que cidade pertence;
Qual a média de veículos nas cinco cidades juntas;
Qual a média de acidentes de trânsito nas cidades com menos de 2.000 veículos de passeio.
 */