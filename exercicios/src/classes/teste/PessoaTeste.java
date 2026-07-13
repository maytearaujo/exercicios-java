package classes.teste;
import classes.dominio.Pessoa;
import java.util.Scanner;

public class PessoaTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		Pessoa pessoa = new Pessoa();
		char resposta;
		double aumentoPeso, aumentoAltura, reduziuPeso;
		int anos;
		
		pessoa.setNome("Gariela");
		pessoa.setIdade(23);
		pessoa.setAltura(1.78);
		pessoa.setPeso(72);
		
		System.out.println(pessoa.getNome() + " " + pessoa.getIdade()
		 + " " + pessoa.getAltura() + " " + pessoa.getPeso());

		do {
			System.out.print("\nQuantos anos se passaram desde a última atualização: ");
			anos = input.nextInt();
		} while (anos < 0);
		
		if (anos > 0) {
			pessoa.envelhecer(anos);
		}
		
		do {
			
			System.out.print("Usuário engordou? S / N: ");
			resposta = Character.toUpperCase(input.next().charAt(0));
			
		} while (resposta != 'S' && resposta != 'N');
		
		if (resposta == 'S') {
			do {
				System.out.print("Informe quantos quilos aumentou: ");
				aumentoPeso = input.nextDouble();
			} while (aumentoPeso <= 0);
			
			pessoa.engordar(aumentoPeso);
		} else {
		
			do {
				
				System.out.print("Usuário emagreceu? S / N: ");
				resposta = Character.toUpperCase(input.next().charAt(0));
				
			} while (resposta != 'S' && resposta != 'N');
		
			if (resposta == 'S') {
				do {
					
					System.out.print("Informe quantos quilos diminuiu: ");
					reduziuPeso = input.nextDouble();
					
				} while (reduziuPeso <= 0);
				
				pessoa.emagrecer(reduziuPeso);
			}
		}
		
		do {
			
			System.out.print("Usuário cresceu? S / N: ");
			resposta = Character.toUpperCase(input.next().charAt(0));
			
		} while (resposta != 'S' && resposta != 'N');
		
		if (resposta == 'S') {
			do {
				System.out.print("Informe quantos centimentos aumentou: ");
				aumentoAltura = input.nextDouble();
			} while (aumentoAltura <= 0);
			
			pessoa.crescer(aumentoAltura);
		}
		
		System.out.println("\nInformações atualizadas: ");
		pessoa.imprimir();
		
		input.close();

	}

}
/*
Classe Pessoa: Crie uma classe que modele uma pessoa:

Atributos: nome, idade, peso e altura
Métodos: Envelhercer, engordar, emagrecer, crescer. Obs: Por padrão, a cada ano que nossa pessoa envelhece, sendo a idade dela menor que 21 anos, ela deve crescer 0,5 cm.
*/