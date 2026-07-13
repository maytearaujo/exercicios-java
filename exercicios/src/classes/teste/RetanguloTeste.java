package classes.teste;
import java.util.Scanner;
import classes.dominio.Retangulo;
public class RetanguloTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double base, altura, area, perimetro;
		Retangulo retangulo = new Retangulo();
		
		System.out.print("Informe a base do retângulo: ");
		base = input.nextDouble();
		
		System.out.print("Informe a altura do retângulo: ");
		altura = input.nextDouble();
		
		retangulo.setBase(base);
		retangulo.setAltura(altura);
		
		
		System.out.print("Informe a nova a base do retângulo: ");
		base = input.nextDouble();
		
		System.out.print("Informe a nova altura do retângulo: ");
		altura = input.nextDouble();
		
		retangulo.setBase(base);
		retangulo.setAltura(altura);
		
		retangulo.mudarValorLados(base, altura);
				
		System.out.println(retangulo.retornarValorLados());
		
		area = retangulo.calcularArea();
		perimetro = retangulo.calcularPerimetro();
		
		System.out.println("Area: " + area);
		System.out.println("Perímetro: " + perimetro);
				
		input.close();
	}

}
/*
Classe Retangulo: Crie uma classe que modele um retangulo:

Atributos: LadoA, LadoB (ou Comprimento e Largura, ou Base e Altura, a escolher)
Métodos: Mudar valor dos lados, Retornar valor dos lados, calcular Área e calcular Perímetro;
Crie um programa que utilize esta classe. Ele deve pedir ao usuário que informe as medidades de um local. Depois, deve criar um objeto com as medidas e calcular a quantidade de pisos e de rodapés necessárias para o local.
*/