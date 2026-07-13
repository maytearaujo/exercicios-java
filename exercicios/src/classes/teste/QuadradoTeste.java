package classes.teste;
import classes.dominio.Quadrado;
import java.util.Scanner;

public class QuadradoTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Quadrado quadrado = new Quadrado();
		Scanner input = new Scanner(System.in);
		
		System.out.print("Informe o lado do quadrado: ");
		quadrado.setTamanhoLado(input.nextDouble());
		
		System.out.print("Informe o novo lado: ");
		quadrado.mudarValorLado(input.nextDouble());
				
		System.out.println("Novo valor lado: " + quadrado.retornarValorLado());
		System.out.println("Área do quadrado: " + quadrado.calcularArea());
		
		input.close();
	}

}
/*
Classe Quadrado: Crie uma classe que modele um quadrado:

Atributos: Tamanho do lado
Métodos: Mudar valor do Lado, Retornar valor do Lado e calcular Área;
*/