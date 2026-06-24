package funcoes;
import java.util.Arrays;
import java.util.ArrayList;

public class Exercicio14 {
	
	public static boolean isMagicSquare (int [] numeros) {
		int soma = Arrays.stream(numeros).sum();
		final int CONSTANTE_MAGICA = soma / 3;
		int linha1, linha2, linha3,
		coluna1, coluna2, coluna3,
		diagonal1, diagonal2;
		
		linha1 = numeros[0] + numeros[1] + numeros[2];
		linha2 = numeros[3] + numeros[4] + numeros[5] ;
		linha3 = numeros[6] + numeros[7] + numeros[8];
		
		coluna1 = numeros[0] + numeros[3] + numeros[6];
		coluna2 = numeros[1] + numeros[4] + numeros[7];
		coluna3 = numeros[2] + numeros[5] + numeros[8];
		
		diagonal1 = numeros[0] + numeros[4] + numeros[8];
		diagonal2 = numeros[2] + numeros[4] + numeros[6];
		
		if (linha1 == CONSTANTE_MAGICA && linha2 == CONSTANTE_MAGICA && linha3 == CONSTANTE_MAGICA &&
				coluna1 == CONSTANTE_MAGICA && coluna2 == CONSTANTE_MAGICA && coluna3 == CONSTANTE_MAGICA &&
				diagonal1 == CONSTANTE_MAGICA && diagonal2 == CONSTANTE_MAGICA )
			return true;
		else
			return false;
	}

	public static int [] quadradoMagico() {
		
		int[] numeros = {1,2,3,4,5,6,7,8,9};

		int [] quadrado = new int [9];	
		ArrayList <Integer> pares = new ArrayList<>();
		ArrayList <Integer> impares = new ArrayList<>();
		
		int [] posicoesPares = {0, 2, 6, 8}, posicoesImpares = {1, 3, 5, 7};
		
		for (int i = 1; i <= 9; i++) { 
			
			if (i % 2 == 0) 
				pares.add(i); 
			else { 
				if (i != 5) 
					impares.add(i); 
			} 
		}
		
		//numeros = {8,3,4,1,5,9,6,7,2};
		for (int i = 0; i < quadrado.length; i ++) {
			for (int j = 1; j < quadrado.length; j ++) {
				/*aux = numeros[i];
				numeros[i] = numeros[j];
				numeros[j] = aux;*/
				
				numeros[posicoesPares[i]] = pares.get(i);
				

				if (isMagicSquare(numeros)) {
					quadrado = numeros.clone();
				}
			}
		}
		
		
		return quadrado;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] quadrado;
		
		quadrado = quadradoMagico();
		
		for (int i = 0; i < quadrado.length; i++) {
			System.out.print(quadrado[i]+ " ");
			
			if (i == 2 || i == 5)
				System.out.print("\n");
		}
	}

}
/*
Quadrado mágico. Um quadrado mágico é aquele dividido em linhas e colunas, com um número em cada posição e no qual a soma das linhas, colunas e diagonais é a mesma. Por exemplo, veja um quadrado mágico de lado 3, com números de 1 a 9:

8  3  4 
1  5  9
6  7  2
Elabore uma função que identifica e mostra na tela todos os quadrados mágicos com as características acima. Dica: produza todas as combinações possíveis e verifique a soma quando completar cada quadrado. Usar um vetor de 1 a 9 parece ser mais simples que usar uma matriz 3x3.
*/