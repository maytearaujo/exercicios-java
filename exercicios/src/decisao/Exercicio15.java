package decisao;
import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner(System.in);
		int lado1, lado2, lado3;
		
		System.out.print("Informe o 1º lado do triângulo: ");
		lado1 = leitor.nextInt();
		
		System.out.print("Informe o 2º lado do triângulo: ");
		lado2 = leitor.nextInt();
		
		System.out.print("Informe o 3º lado do triângulo: ");
		lado3 = leitor.nextInt();
		
		if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {
			if (lado1 == lado2 && lado1 == lado3)
				System.out.println("Triângulo Equilátero");
			else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3)
				System.out.println("Triângulo Isósceles");
			else if (lado1 != lado2 && lado1 != lado3 && lado2 != lado3)
				System.out.println("Triângulo Escaleno");
			
		} else
			System.out.println("Os valores informados não formam um triângulo");
		
		leitor.close();
	}

}
