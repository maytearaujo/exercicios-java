package classes.teste;

import classes.dominio.Bola;

public class Exercicio01_BolaTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bola bola = new Bola();
		
		bola.setCor("Vermelho");
		bola.setCircunferencia(68);
		bola.setMaterial("couro");

		System.out.printf("Bola inicial:\n%s %d %s", 
				bola.getCor(), bola.getCircunferencia(), bola.getMaterial());
		
		
		bola.trocaCor();
		System.out.printf("\n\nApós a troca da cor: ");
		bola.mostraCor();

	}

}

/*
Classe Bola: Crie uma classe que modele uma bola:

Atributos: Cor, circunferência, material
Métodos: trocaCor e mostraCor
*/