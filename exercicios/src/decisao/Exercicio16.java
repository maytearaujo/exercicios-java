package decisao;
import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner(System.in);
		double a, b, c, x1, x2, delta;
		
		System.out.print("Vamos calcular equação do segundo grau\n");
		System.out.print("Informe o valor de A: ");
		a = leitor.nextFloat();
		
		if (a == 0) 
			System.out.println("Não é uma equação de 2º Grau");
		else {
			System.out.print("Informe o valor de B: ");
			b = leitor.nextFloat();
			
			System.out.print("Informe o valor de C: ");
			c = leitor.nextFloat();
			
			delta = (b*b)- 4 * a * c;
			
			if (delta < 0)
				System.out.println("A equação não possui raizes reais");
			if (delta == 0) {
				x1 = -b / 2 * a;
				System.out.printf("A equação possui apenas uma raiz real: x = %.0f", x1);
			}
			else if (delta > 0) {
				x1 = (-b + Math.sqrt(delta))/2*a;
				x2 = (-b - Math.sqrt(delta))/2*a;
				System.out.printf("A equação possui duas raiz reais: x1 = %.2f, x2 = %.0f", x1, x2);
			}
		
		}
		leitor.close();
	}

}
