package listas;
import java.util.Scanner;
import java.util.ArrayList;

public class Exercicio15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner(System.in);
		ArrayList <Float> numeros = new ArrayList<>();
		float num, soma = 0, media;
		int qtdAcimaMedia = 0, qtdAbaixoSete = 0;
		
		do {
			System.out.print("Informe uma nota: ");
			num = leitor.nextFloat();
			
			if (num != -1)
				numeros.add(num);
			
		} while (num != -1); 
		
		if (!numeros.isEmpty()) {
			System.out.println("\nForam lidos " + numeros.size() + " valores\n");
			
			for (float n : numeros) {
				System.out.print(n + "  ");
				soma += n;
			}
			
			System.out.println("\n");
			
			for (int i = numeros.size()-1; i >= 0; i--) 
				System.out.println(numeros.get(i));
	
			media = soma / numeros.size();
			
			System.out.println("\nSoma das notas: " + soma);
			System.out.println("\nMédia das notas: " + media);
			
			for (float numero: numeros) {
				if (numero > media )
					qtdAcimaMedia++;
				
				if (numero < 7)
					qtdAbaixoSete++;
			}
			
			System.out.println("\n" + qtdAcimaMedia + " notas acima da média");
			System.out.println("\n" + qtdAbaixoSete + " notas abaixo de sete");
		
		}		
		System.out.print("\nPrograma Finalizado!");
		
		leitor.close();

	}

}
/*
Faça um programa que leia um número indeterminado de valores, correspondentes a notas, 
encerrando a entrada de dados quando for informado um valor igual a -1 (que não deve ser armazenado). Após esta entrada de dados, faça:
Mostre a quantidade de valores que foram lidos;
Exiba todos os valores na ordem em que foram informados, um ao lado do outro;
Exiba todos os valores na ordem inversa à que foram informados, um abaixo do outro;
Calcule e mostre a soma dos valores;
Calcule e mostre a média dos valores;
Calcule e mostre a quantidade de valores acima da média calculada;
Calcule e mostre a quantidade de valores abaixo de sete;
Encerre o programa com uma mensagem;
*/