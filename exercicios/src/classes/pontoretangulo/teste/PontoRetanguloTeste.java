package classes.pontoretangulo.teste;
import java.util.Scanner;
import classes.pontoretangulo.dominio.*;

public class PontoRetanguloTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Ponto ponto = new Ponto(10,20);
		Retangulo retangulo = new Retangulo(8, 6, ponto);
		Ponto centro;
		int opcao, x = 0, y = 0, largura = 0, altura = 0;
		
		Retangulo retangulo2 = new Retangulo(9,7, ponto);
		Retangulo retangulo3 = new Retangulo(5,3, ponto);
		
		System.out.println("Coordenadas do centro do retângulo: ");
		centro = retangulo.encontrarCentroRetangulo();
		centro.imprimir();
						
		do {

			System.out.println(""
					+ "\n**************************\n"
					+ "          Menu\n"
					+ "**************************\n"
					+ "1 - Alterar os valores do retângulo\n"
					+ "2 - Imprimir o centro deste retângulo\n"
					+ "0 - Sair\n"
					+ "**************************\n");
			
			do {
				
				System.out.print("Escolha uma opção: ");
				opcao = input.nextInt();
				
			} while (opcao < 0 || opcao > 2);
			
			if (opcao == 0) {
				System.out.println("\nPrograma finalizado!");
				
			} else if (opcao == 1) {
				
				System.out.print("Digite o valor da largura do retângulo: ");
				largura = input.nextInt();
				
				System.out.print("Digite o valor da altura do retângulo: ");
				altura = input.nextInt();

				retangulo = new Retangulo(largura, altura, ponto);	
				
			} else if (opcao == 2) {
				
				System.out.println("Coordenadas do centro do retângulo: ");
				centro = retangulo.encontrarCentroRetangulo();
				centro.imprimir();
				
			}
				
	

			
			System.out.println("\n");
		} while (opcao != 0);
		
		
		input.close();
	}

}

/*
Classe Ponto e Retangulo: Faça um programa completo utilizando funções e classes que:

a. Possua uma classe chamada Ponto, com os atributos x e y.
b. Possua uma classe chamada Retangulo, com os atributos largura e altura.
c. Possua uma função para imprimir os valores da classe Ponto
d. Possua uma função para encontrar o centro de um Retângulo.
e. Você deve criar alguns objetos da classe Retangulo.
f. Cada objeto deve ter um vértice de partida, por exemplo, o vértice inferior esquerdo do retângulo, que deve ser um objeto da classe Ponto.
g. A função para encontrar o centro do retângulo deve retornar o valor para um objeto do tipo ponto que indique os valores de x e y para o centro do objeto.
h. O valor do centro do objeto deve ser mostrado na tela
i. Crie um menu para alterar os valores do retângulo e imprimir o centro deste retângulo.
*/