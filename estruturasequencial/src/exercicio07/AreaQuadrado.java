package exercicio07;
import java.util.Scanner;

public class AreaQuadrado {
	public static void main (String[] args){
		Scanner leitor = new Scanner(System.in);
		float area, lado, dobroArea;
		
		System.out.println("Informe o valor do lado do quadrado: ");
		lado = leitor.nextFloat();
		
		area = lado * lado;
		dobroArea = area * 2;
		
		System.out.printf("Área do quadrado: %.2f %n", area);
		System.out.printf("Dobro da área do quadrado: %.2f", dobroArea);
	}

}
