package classes.teste;
import classes.dominio.Macaco;

public class MacacoTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Macaco macaca = new Macaco("Chita");
		Macaco macaco = new Macaco("Chipanzé");
		
		macaca.comer("Melancia");
		System.out.println(macaca.verificarEstomago());

		macaca.comer("Banana");
		System.out.println(macaca.verificarEstomago());

		macaca.comer("Abacaxi");
		System.out.println(macaca.verificarEstomago());
		
		macaco.comer("Melão");
		System.out.println(macaco.verificarEstomago());

		macaco.comer("Mamão");
		System.out.println(macaco.verificarEstomago());

		macaco.comer("Maça");
		System.out.println(macaco.verificarEstomago());
		
		macaco.digerir();
		System.out.println(macaco.verificarEstomago());
		//macaco.comer(macaco); com erro The method comer(String) in the type Macaco is not applicable for the arguments (Macaco)
	}

}
/*
Classe Macaco: Desenvolva uma classe Macaco,que possua os atributos nome e bucho (estomago) e pelo menos os 
métodos comer(), verBucho() e digerir(). Faça um programa ou teste interativamente, criando pelo menos dois macacos, 
alimentando-os com pelo menos 3 alimentos diferentes e verificando o conteúdo do estomago a cada refeição. Experimente fazer com que um macaco coma o outro. É possível criar um macaco canibal?
*/