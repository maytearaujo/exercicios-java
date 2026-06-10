package listas;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Exercicio14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int qtdRespostasPositivas = 0;
		char resposta;
		Scanner input = new Scanner(System.in);
		
		ArrayList <String> perguntas = new ArrayList <> (List.of(
				"Telefonou para a vítima?",
				"Esteve no local do crime?",
				"Mora perto da vítima?",
				"Devia para a vítima?",
				"Já trabalhou com a vítima?"
		));

		ArrayList <String> classificacao = new ArrayList <>(List.of(
				"Suspeita", "Cúmplice", "Assassino", "Inocente"
		));
		

		for (String pergunta: perguntas) {
			do {
				System.out.println(pergunta);
				resposta = Character.toUpperCase(input.next().charAt(0));				
			} while (resposta != 'S' && resposta != 'N');
			
			if (resposta == 'S' )
				qtdRespostasPositivas++;
		}
		
		if (qtdRespostasPositivas == 2)
			System.out.println(classificacao.get(0));
		else if (qtdRespostasPositivas >= 3 && qtdRespostasPositivas <= 4)
			System.out.println(classificacao.get(1));
		else if (qtdRespostasPositivas == 5)
			System.out.println(classificacao.get(2));
		else 
			System.out.println(classificacao.get(3));
		
		input.close();
	}

}
/*
Utilizando listas faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:
"Telefonou para a vítima?"
"Esteve no local do crime?"
"Mora perto da vítima?"
"Devia para a vítima?"
"Já trabalhou com a vítima?" 
O programa deve no final emitir uma classificação sobre a participação da pessoa no crime. 
Se a pessoa responder positivamente a 2 questões ela deve ser classificada como "Suspeita", 
entre 3 e 4 como "Cúmplice" e 5 como "Assassino". 
Caso contrário, ele será classificado como "Inocente"
*/