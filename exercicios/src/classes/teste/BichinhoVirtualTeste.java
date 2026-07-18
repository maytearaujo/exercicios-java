package classes.teste;
import java.util.Scanner;
import classes.dominio.BichinhoVirtual;

public class BichinhoVirtualTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		BichinhoVirtual bichinhoVirtual = new BichinhoVirtual();
		String nome;
		int idade, fome, saude;
		
		System.out.print("Informe o nome do bichinho virtual: ");
		nome = input.nextLine();
		
		System.out.print("Informe a idade do bichinho virtual: ");
		idade = input.nextInt();
		
		System.out.print("Informe a fome do bichinho virtual: ");
		fome = input.nextInt();
		
		System.out.print("Informe a saúde do bichinho virtual: ");
		saude = input.nextInt();
		
		
		bichinhoVirtual.setNome(nome);
		bichinhoVirtual.setFome(fome);
		bichinhoVirtual.setIdade(idade);
		bichinhoVirtual.setSaude(saude);
		System.out.println("\nInformações sobre o seu Bichinho Virtual: "); 
		System.out.println("Nome: " +bichinhoVirtual.getNome());
		System.out.println("Idade: " +bichinhoVirtual.getIdade());
		System.out.println("Fome: " +bichinhoVirtual.getFome());
		System.out.println("Saúde: " +bichinhoVirtual.getSaude());
		System.out.println("Humor: " +bichinhoVirtual.getHumor());
		input.close();
	}

}

/*
Classe Bichinho Virtual:Crie uma classe que modele um Tamagushi (Bichinho Eletrônico):

a. Atributos: Nome, Fome, Saúde e Idade 
b. Métodos: Alterar Nome, Fome, Saúde e Idade; 
Retornar Nome, Fome, Saúde e Idade 

Obs: Existe mais uma informação que devemos levar em consideração, o Humor do nosso tamagushi, 
este humor é uma combinação entre os atributos Fome e Saúde, ou seja, um campo calculado, 
então não devemos criar um atributo para armazenar esta informação por que ela pode ser calculada a qualquer momento.
*/