package classes.teste;

import java.util.Scanner;

import classes.dominio.BichinhoVirtualPlus;

public class BichinhoVirtualPlusTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		BichinhoVirtualPlus bichinhoVirtualPlus;
		String nome;
		int idade, fome, saude, qtdComida, tempoBrincadeira;
		
		System.out.print("Informe o nome do bichinho virtual: ");
		nome = input.nextLine();
		
		System.out.print("Informe a idade do bichinho virtual: ");
		idade = input.nextInt();
		
		System.out.print("Informe a fome do bichinho virtual: ");
		fome = input.nextInt();
		
		System.out.print("Informe a saúde do bichinho virtual: ");
		saude = input.nextInt();
		
		
		System.out.print("Informe a quantidade de comida do bichinho virtual: ");
		qtdComida = input.nextInt();
		
		System.out.print("Informe tempo de brincadeira do bichinho virtual: ");
		tempoBrincadeira = input.nextInt();
		
		bichinhoVirtualPlus = new BichinhoVirtualPlus(fome);
				
		bichinhoVirtualPlus.setNome(nome);
		bichinhoVirtualPlus.setIdade(idade);
		bichinhoVirtualPlus.setSaude(saude);
		bichinhoVirtualPlus.ajustarFome(qtdComida);
		bichinhoVirtualPlus.ajustarTedio(tempoBrincadeira);
		
		
		
		System.out.println("\nInformações sobre o seu Bichinho Virtual: "); 
		System.out.println("Nome: " + bichinhoVirtualPlus.getNome());
		System.out.println("Idade: " + bichinhoVirtualPlus.getIdade());
		System.out.println("Fome: " + bichinhoVirtualPlus.getFome());
		System.out.println("Saúde: " + bichinhoVirtualPlus.getSaude());
		System.out.println("Humor: " + bichinhoVirtualPlus.getHumor());
		System.out.println("Nova Fome: " + bichinhoVirtualPlus.getFome());
		System.out.println("Tedio: " + bichinhoVirtualPlus.getTedio());
		
		System.out.println(bichinhoVirtualPlus.toString());
		input.close();
		
		
		
	}

}
/*
Classe Bichinho Virtual++: Melhore o programa do bichinho virtual, permitindo que o usuário especifique quanto de comida ele fornece ao bichinho e por quanto tempo ele brinca com o bichinho. Faça com que estes valores afetem quão rapidamente os níveis de fome e tédio caem.
*/