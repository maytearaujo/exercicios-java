package exercicio06;
import java.util.Scanner;

public class AreaCirculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner(System.in);
		float raio, area;
		
		System.out.print("Informe o raio do círculo: ");
		raio = leitor.nextFloat();
		
		area = (float) (3.14 * (raio * raio));
		System.out.printf("A área do círculo é: %.2f", area);
	}

}
