package repeticao;
import java.util.Scanner;
import java.util.ArrayList;

public class Exercicio37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner(System.in);
		ArrayList <ArrayList<Float>> clientes = new ArrayList<>();
		ArrayList <Float> cliente = new ArrayList<>();		
		float codigo, altura, peso, mediaAlturas, mediaPesos, somaAlturas = 0, somaPesos = 0;
		float maisAlto, maisBaixo, maisMagro, maisGordo;
		int indexMaisAlto = 0, indexMaisBaixo = 0, indexMaisMagro = 0, indexMaisGordo = 0;
		float alturaAtual = 0, pesoAtual = 0;
		final int INDICE_ALTURA = 1, INDICE_PESO = 2;
		
		do {
			System.out.print("Informe o código: ");
			codigo = leitor.nextFloat();
			
			if (codigo != 0) {
				System.out.print("Informe o altura: ");
				altura = leitor.nextFloat();
				System.out.print("Informe o peso: ");
				peso = leitor.nextFloat();
			
				System.out.println("");

				cliente.add(codigo);
				cliente.add(altura );
				cliente.add(peso);
				
				clientes.add(cliente);
				
				somaAlturas += altura;
				somaPesos += peso;
				
			}
			cliente = new ArrayList<>();
			
		} while (codigo != 0);
		
		if (!clientes.isEmpty()) {
		
			maisAlto = clientes.get(0).get(INDICE_ALTURA);
			maisBaixo = clientes.get(0).get(INDICE_ALTURA);
			maisMagro = clientes.get(0).get(INDICE_PESO);
			maisGordo = clientes.get(0).get(INDICE_PESO);
			
			
			for (int i = 1; i < clientes.size(); i++) {
				alturaAtual = clientes.get(i).get(INDICE_ALTURA);
				pesoAtual = clientes.get(i).get(INDICE_PESO);
				
				if (alturaAtual > maisAlto) {
					maisAlto = alturaAtual;
					indexMaisAlto = i;
				}
	
				if (alturaAtual < maisBaixo) {
					maisBaixo = alturaAtual;
					indexMaisBaixo = i;
				}
	
				if (pesoAtual < maisMagro) {
					maisMagro = pesoAtual;
						indexMaisMagro = i;
					}
				
				if (pesoAtual > maisGordo) {
					maisGordo = pesoAtual;
					indexMaisGordo = i;
				}
			}
			
			mediaAlturas = somaAlturas / clientes.size();
			mediaPesos = somaPesos / clientes.size();
			
			System.out.println(clientes);
			System.out.println("Mais Alto: "+ clientes.get(indexMaisAlto));
			System.out.println("Mais Baixo: "+ clientes.get(indexMaisBaixo));
			System.out.println("Mais Magro: "+ clientes.get(indexMaisMagro));
			System.out.println("Mais Gordo: "+ clientes.get(indexMaisGordo));
			System.out.println("Média alturas: "+ mediaAlturas);
			System.out.println("Média pesos: "+ mediaPesos);
		} else 
			System.out.println("Lista está vazia.");
		leitor.close();
	}

}
/*
Uma academia deseja fazer um senso entre seus clientes para descobrir o mais alto, o mais baixo, a mais gordo e o mais magro, 
para isto você deve fazer um programa que pergunte a cada um dos clientes da academia seu código, sua altura e seu peso. 
O final da digitação de dados deve ser dada quando o usuário digitar 0 (zero) no campo código. Ao encerrar o programa também 
deve ser informados os códigos e valores do clente mais alto, do mais baixo, do mais gordo e do mais magro, além da média das alturas 
e dos pesos dos clientes

*/