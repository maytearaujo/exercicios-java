package funcoes;
import java.util.Scanner;

public class Exercicio13 {
	public static String construirRetangulo(int linhas, int colunas) {
				
		String retangulo = "";
		
		if (linhas < 1)
			linhas = 1;
		else if (linhas > 20)
			linhas = 20;
		
		if (colunas < 1)
			colunas = 1;
		else if ( colunas > 20)
			colunas = 20;
		
		for (int i = 1; i <= linhas; i++) {

			for (int j = 1; j <= colunas; j++) {

		        if ((i == 1 || i == linhas) &&
		            (j == 1 || j == colunas)) {

		            retangulo += "+";
		        }
		        else if (i == 1 || i == linhas) {

		            retangulo += "-";
		        }
		        else if (j == 1 || j == colunas) {

		            retangulo += "|";
		        }
		        else {

		            retangulo += " ";
		        }
		    }

		    retangulo += "\n";

		}
						
		
		return retangulo;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		int linhas, colunas;
		
		System.out.print("Informe a quantidade de linhas: ");
		linhas = input.nextInt();

		System.out.print("Informe a quantidade de colunas: ");
		colunas = input.nextInt();
		
		System.out.print(construirRetangulo(linhas, colunas));
		
		input.close();
	}

}

/*
Desenha moldura. Construa uma função que desenhe um retângulo usando os caracteres ‘+’ , ‘−’ e ‘| ‘. Esta função deve receber dois parâmetros, linhas e colunas, sendo que o valor por omissão é o valor mínimo igual a 1 e o valor máximo é 20. Se valores fora da faixa forem informados, eles devem ser modificados para valores dentro da faixa de forma elegante.

*/