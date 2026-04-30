package sequencial;
import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		float metros, centimetros;
		
		System.out.println("Informe a medida em metros");
		metros = leia.nextFloat();
		centimetros = metros * 100;
		System.out.printf("%.2f metros equivalem a %.2f centimetros", metros, centimetros);
		
		leia.close();
	}

}
